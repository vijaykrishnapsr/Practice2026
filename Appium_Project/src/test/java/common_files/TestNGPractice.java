package common_files;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGPractice {
	
    @Test(priority = 1, invocationCount = 6,threadPoolSize = 3)
	public void signup() {
    
		System.out.println("SignUp");

	}
    @Parameters({"email","pass"})
    @Test(priority = 2)
	public void login(String emailID, String Password) {

		System.out.println("Login");
		System.out.println(emailID);
		System.out.println(Password);


	}
    
    @Test(priority = 3)
	public void continueAsGuest() {
		System.out.println("continueAsGuest");

	}
    
    @Test(priority = 4, description="Adding an item to cart")
	public void addToCart() {
		System.out.println("addToCart");

	}
    @Test(priority = 5)
	public void checkout() {
		System.out.println("checkout");

	}
    @Test(priority = 6)
	public void payment() {
		System.out.println("payment");

	}
    @Test(priority = 7)
	public void orderConfirmation() {
		System.out.println("orderConfirmation");

	}
	
}
