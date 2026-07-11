package vijay;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child extends ObjectClass {
@Test

public static void launchChromeBrowser() throws InterruptedException {
	System.out.println(Thread.currentThread().getName());
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get("https://beta.mcalistersdeli.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.id("signin-button"));
	element.click();
	//clickByid("signin-button");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin-button")));
	Thread.sleep(8000);
	WebElement element1 = driver.findElement(By.id("signin-button"));
	element1.click();
	Thread.sleep(8000);
	//clickByid("signin-button");
	driver.findElement(By.id("email")).sendKeys("mcaqa@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Test@123");
	driver.findElement(By.id("sign-in-button")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("/menu")));
	Thread.sleep(8000);
	driver.findElement(By.id("/menu")).click();
	Thread.sleep(8000);
	//driver.findElement(By.xpath("(//div[@class='menuDescCtr'])[1]")).click();
	//Thread.sleep(8000);
	List<WebElement> elements = driver.findElements(By.xpath("//p[@class='pdpListTileText']"));
	for(WebElement item : elements) {

		String productName = item.getText();
		System.out.println(productName);
	}


	//driver.close();
}

//@Test

//public void launchFirfoxBrowser() {
//	System.out.println(Thread.currentThread().getName());
//	WebDriverManager.firefoxdriver().setup();
  //  driver = new FirefoxDriver();
    //driver.get("https://beta.mcalistersdeli.com/");
    //driver.manage().window().maximize();

//}


}