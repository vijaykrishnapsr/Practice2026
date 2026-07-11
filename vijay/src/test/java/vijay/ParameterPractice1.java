package vijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterPractice1 {

	public static WebDriver driver;


	@DataProvider(name = "LoginDetails")
	public Object[][] testData() {
		Object[][] data= {{"cucumber@gmail.com","Test@123"},
				         {"testng@gmail.com","Test@123"},
				         {"mcaqa@gmail.com","Test@123"}};
		return data;
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "LoginDetails")
	public void signIn(String uname, String pswd) {

		driver.get("https://beta.mcalistersdeli.com/signin");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.id("sign-in-button")).click();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
