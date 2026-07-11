package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendedReports {
	WebDriver driver;
	ExtentSparkReporter spark;
	ExtentReports reports;

	@BeforeSuite
	public void initialSetup() {

		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		spark = new ExtentSparkReporter("extendedreport.html");
		reports = new ExtentReports();
		reports.attachReporter(spark);

	}

	@Test
	public void loginTest() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement uname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		uname.sendKeys("student");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.sendKeys("Password123");
		WebElement submitBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
		submitBtn.click();
		ExtentTest test = reports.createTest("Verity Login page", "Verify the User credentials");
		test.addScreenCaptureFromPath("LoginScreen");
		ExtentTest info = test.info("Vijaykrishna");
		info.addScreenCaptureFromPath("SceondScreenshot");

	}

	@AfterSuite
	public void endSetup() {

		reports.flush();
		driver.close();
	}

}
