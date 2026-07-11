package MyMCA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	
	@FindBy(id="email")
	public static WebElement userName ;

	@FindBy(id="password")
	public static WebElement passWord ;
	
	@FindBy(id="sign-in-button")
	public static WebElement signInButton;
}
