package com.TestNGPracticeSuite;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	WebDriver driver;

//	@DataProvider(name = "logindata")
//	public Object[][] testData() {
//
////		Object[][] data = new Object[][];
////		return data;
//	}

	@Parameters({ "browser" })
	@Test(priority = 1, enabled = true)
	public void loginTest(String browserName) {
		switch (browserName) {

		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launched Chrome Driver");
			break;

		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("Launched FireFox Driver");
			break;
		}
		System.out.println("Logging in as a Existing User");
	}

	@Test(priority = 2, dependsOnMethods = "loginTest", alwaysRun = true)
	public void viewProduct() {
		System.out.println("Viewing a Product PDP");
	}

	@Test(priority = 3, invocationCount = 3, invocationTimeOut = 2000, threadPoolSize = 3)
	public void addToCart() {
		System.out.println("Adding a product to cart");
	}

	@Parameters({ "username", "password" })
	@Test(priority = 4, timeOut = 1000)
	public void applyOffers(String uname, String pword) {
		System.out.println(uname);
		System.out.println(pword);
		System.out.println("Applying offers if applicable");
	}

	@Test(priority = 5, description = "Checkout from Cart page to Order page", groups = "smoke")
	public void checkout() {
		System.out.println("Checkout from Cart page");
	}

	@Test(priority = 6, expectedExceptions = {
			ArithmeticException.class }, groups = "sanity", dependsOnGroups = "smoke")
	public void payment() {
		int a = 10 / 0;
		System.out.println("Payment processing");
	}

	@Test(priority = 7, groups = "smoke")
	public void placeOrder() {

		System.out.println("Completing an Order");
	}

}
