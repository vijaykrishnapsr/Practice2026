package HooksPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import stepdefinitions.Loginteststepdef;

public class HooksTest {

	@Before("@smoke")
	public void browserSetup() {

		System.out.println("Tagged @Before");

	}

	@After("@smoke")
	public void browserTearDown(Scenario scenario) throws IOException {
		System.out.println("Tagged @After");

		if (scenario.isFailed()) {

			TakesScreenshot ts = (TakesScreenshot) Loginteststepdef.driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("target/failure-screenshot.png");
			FileUtils.copyFile(source, destination);

		}
		Loginteststepdef.driver.close();
	}
//	@BeforeAll
//	public static void test01() {
//		System.out.println("Before All");
//	}
//	
//	@BeforeStep
//	public void test02() {
//		System.out.println("Before Each Step");
//		
//	}
//	@AfterStep
//	public void test03() {
//		System.out.println("After Each Step");
//	}

}
