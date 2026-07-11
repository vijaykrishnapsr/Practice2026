package stepdefinitions;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginteststepdef {

	public static WebDriver driver;

	@Given("Launch the application")
	public void launch_the_application() {

		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();

	}

	@When("the user enters username and password")
	public void the_user_enters_username_and_password() {
     
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		throw new NoSuchElementException();

	}

	@When("the user enter username and password")
	public void the_user_enter_username_and_password(DataTable table) {
		List<List<String>> credentials = table.asLists();
		for (List<String> credential : credentials) {

			String uname = credential.get(0);
			String pword = credential.get(1);

			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pword);
		}

	}

	@When("the user entering username and password")
	public void the_user_entering_username_and_password(DataTable table) {
		List<Map<String, String>> credentials = table.asMaps();

		String uname = credentials.get(0).get("username");
		String pword = credentials.get(0).get("password");

		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));

		usernameField.sendKeys(uname);
		passwordField.sendKeys(pword);

	}
//	@When("the user enters username and password")
//	public void the_user_enters_username_and_password(DataTable table) {
//		List<Map<String, String>> credentials = table.asMaps();
//		
//		for(Map<String, String> credential:credentials) {
//		String uname = credential.get("username");
//		String pword = credential.get("password");
//		
//			driver.findElement(By.id("username")).sendKeys(uname);
//			driver.findElement(By.id("password")).sendKeys(pword);
//		}
//
//	}

	@And("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {

		driver.findElement(By.id("submit")).click();

	}

	@Then("the user should be successfully logged in to the application")
	public void the_user_should_be_successfully_logged_in_to_the_application() {

	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String uname, String pword) {

		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);

	}

	@Given("Launching the application")
	public void launching_the_application() {
		System.out.println("Launching the application");

	}

	@Given("User navigates to Home page")
	public void user_navigates_to_home_page() {
		System.out.println("User navigates to Home page");
	}

}
