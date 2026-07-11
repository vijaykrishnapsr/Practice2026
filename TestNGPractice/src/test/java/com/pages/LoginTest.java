package com.pages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginTest {

	public static WebDriver driver;

	@Test(priority = 1)
	@Parameters("browser")
	public void browserLaunch(String browser) {
		
		switch (browser) {
		
		case "chrome":
			driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/");
			driver.manage().window().maximize();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.get("https://practicetestautomation.com/");
			break;
		default:
			System.out.println("Browser is not defined");
			break;
		}
//
//		driver.get("https://practicetestautomation.com/");
//		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	public void clickOnPractice() {
		driver.findElement(By.id("menu-item-20")).click();
	}

	@Test(priority = 3)
	public void clickOnTestLoginPage() {
		driver.findElement(By.xpath("//a[contains(text(),'Test Login Page')]")).click();
	}

	@Test(priority = 4)
	@Parameters({ "username", "password" })
	public void enterCredentials(String uname, String pword) {
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
	}

	@Test(priority = 5)
	public void clickOnSubmitCTA() {
		driver.findElement(By.id("submit")).click();
	}

	@Test(priority = 6)
	public void verifySuccessfullyLoggedIn() {
		WebElement successMessage = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
		Assert.assertEquals(successMessage.getText(), "Logged In Successfully");
	}

	@Test(priority = 7)
	public void browserClose() {
		driver.quit();
	}

}
