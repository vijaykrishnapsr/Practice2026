package MyMCA;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class McaMain extends DataProviderClass {

	public static WebDriver driver;

	@BeforeSuite
	public void browserLunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterSuite
	public void browserClose() {

		driver.quit();
	}

	// @Test(dataProvider = "Testdata", dataProviderClass = DataProviderClass.class)
	@Test(dataProvider = "logindata")
	public void signIn(String uname, String pword) {
		PageFactory.initElements(driver, SignInPage.class);

		driver.get("https://beta.mcalistersdeli.com/signin");
		SignInPage.userName.sendKeys(uname);
		SignInPage.passWord.sendKeys(pword);
		SignInPage.signInButton.click();
	}

	@Test
	@DataProvider(name = "logindata")
	public static Object[][] extractdata() throws IOException {

		FileInputStream file = new FileInputStream(
				"/Users/vijayakrishnamoorthy.cellasamy/eclipse-workspace/MCA/src/test/resources/Book.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);

		int totalRows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println(totalRows);
		Object[][] data = new String[totalRows][2];
		for (int i = 1; i <=totalRows; i++) {

			String userName = sheet.getRow(i).getCell(0).getStringCellValue();
			String passWord = sheet.getRow(i).getCell(1).getStringCellValue();
			
			data[i - 1][0] = userName;
			data[i - 1][1] = passWord;
		}

		book.close();
		return data;
	}

}
