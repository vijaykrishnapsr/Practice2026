package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common_files.BaseClass;

public class Home_page {

	@FindBy(xpath = "//android.widget.Button[@resource-id=\\\"fbrwelcome/signin-title\\\"]")
	public static WebElement signInBtn;
	
}
