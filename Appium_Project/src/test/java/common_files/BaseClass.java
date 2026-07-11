package common_files;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	public static AndroidDriver driver;

	public static void startAndroidDriver() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Galaxy S22 Ultra");
		options.setPlatformName("Android");
		options.setAppPackage("com.punchh.moes");
		options.setAppActivity("com.focusbrands.appcuisine.dev.moes.MainActivity");
		options.setPlatformVersion("15");
		options.setNoReset(false);
		options.setNewCommandTimeout(Duration.ofMinutes(10));
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void senKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void webDriverWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void alertAccept() {
		WebDriverWait waitAlert = new WebDriverWait(driver, Duration.ofSeconds(50));
		waitAlert.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
