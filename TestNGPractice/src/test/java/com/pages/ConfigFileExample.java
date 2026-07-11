package com.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfigFileExample {

	FileInputStream stream;
	Properties prop;
	String chromeBrowser;
	String firefoxBrowser;
	String testURL;
	String uname;
	String pword;
	WebDriver driver;

	@BeforeSuite
	public void browserLaunch() throws IOException {

	    stream = new FileInputStream("src/test/resources/Utils/config.properties");
		prop = new Properties();
		prop.load(stream);
		chromeBrowser = prop.getProperty("browser");
		firefoxBrowser = prop.getProperty("browser1");
		testURL = prop.getProperty("url");
		uname = prop.getProperty("username");
		pword = prop.getProperty("password");

		if (chromeBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(testURL);
			driver.manage().window().maximize();
		} else if (firefoxBrowser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(testURL);
			driver.manage().window().maximize();
		}

	}
	
	@Test
	public void loginValidation() {
     driver.findElement(By.id("username")).sendKeys(uname);
     driver.findElement(By.id("password")).sendKeys(pword);
     driver.findElement(By.id("submit")).click();
	}
	
	@AfterSuite
	public void closeBrowser(){
		driver.close();
	}
	

}
