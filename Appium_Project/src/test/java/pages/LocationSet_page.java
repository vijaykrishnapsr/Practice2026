package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationSet_page {

	@FindBy(id = "com.punchh.moes:id/fbrstoresearch/street-city-state-zip")
	public static WebElement locationField;

	@FindBy(xpath = "(//android.widget.TextView[@text=\\\"Guam\\\"])[2]")
	public static WebElement guamLocation;

	@FindBy(xpath = "(//android.widget.Button[@content-desc=\\\"ORDER NOW\\\"])[2]")
	public static WebElement orderNow;

	@FindBy(id = "com.punchh.moes:id/fbroverlay/confirm-address")
	public static WebElement confirmAddress;

}
