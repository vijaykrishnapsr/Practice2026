package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExample {
	
	public static WebDriver driver;
	
	@Given("User launches the application")
	public void user_launches_the_application() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("Application launched successfully");
	}
	@And("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		System.out.println("Clicked Sign in button");
      
	}
	@Given("the user is on the login screen")
	public void the_user_is_on_the_login_screen() {
		System.out.println("User is on the Login Screen");

	}
	@When("the user enters username as {string} and Password as {string}")
	public void the_user_enters_username_as_and_password_as(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Entered username and password");
	}
	@Then("the user clicks on Login CTA")
	public void the_user_clicks_on_login_cta() {
        driver.findElement(By.id("submit")).click();
        System.out.println("Clicked Submit button");
        
	}
	
	@Then("the user should be successfully logged in")
	public void the_user_should_be_successfully_logged_in() {
          driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).getText().equalsIgnoreCase("Logged In Successfully");
          System.out.println("User successfully logged in");
         
	}
	
	@Then("the user should see an Error message")
	public void the_user_should_see_an_error_message() {
	    driver.findElement(By.id("errors")).getText().equalsIgnoreCase("Your username is invalid!");
	    System.out.println("User is prevented from logggin in");
	}




}
