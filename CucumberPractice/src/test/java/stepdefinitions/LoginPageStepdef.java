package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepdef {

	WebDriver driver;

	@Given("user launches the application")
	public void user_launches_the_application() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.quit();

	}
//
//	@Then("the user should be successfully logged in")
//	public void the_user_should_be_successfully_logged_in() {
//          driver.findElement(By.className("post-title")).getText().equalsIgnoreCase("Logged In Successfully");
//          System.out.println();
//	}

}
