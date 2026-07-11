package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn_page {

	@FindBy(id = "com.punchh.moes:id/fbrsignin/email")
	public static WebElement email;

	@FindBy(id = "fbrsignin/password")
	public static WebElement password;

	@FindBy(id = "fbrsignin/sign-in-button-title")
	public static WebElement signIn;

}
