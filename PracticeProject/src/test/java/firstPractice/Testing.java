package firstPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	@Test
	public void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void launchFirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void signUp() {
		System.out.println("SignUp completed");
	}

	@Test(dependsOnMethods = "signUp", invocationCount = 3, invocationTimeOut = 10000, threadPoolSize = 3)
	public void login() {
		System.out.println("Logged into the application successfully");
		
	}

}
