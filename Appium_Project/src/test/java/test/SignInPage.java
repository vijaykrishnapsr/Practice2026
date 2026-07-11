package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SignInPage {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Galaxy S22 Ultra");
		options.setPlatformName("Android");
		options.setAppPackage("com.punchh.moes");
		options.setAppActivity("com.focusbrands.appcuisine.dev.moes.MainActivity");
		options.setPlatformVersion("15");
		options.setNoReset(false);
		options.setNewCommandTimeout(Duration.ofMinutes(10));
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		WebDriverWait waitAlert = new WebDriverWait(driver, Duration.ofSeconds(50));
		waitAlert.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement signin = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.Button[@resource-id=\"fbrwelcome/signin-title\"]")));
		signin.click();
		WebElement email = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.punchh.moes:id/fbrsignin/email")));
		email.sendKeys("vijaytest@gmail.com");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fbrsignin/password")));
		password.sendKeys("Test@123");
		WebElement signinButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("fbrsignin/sign-in-button-title")));
		signinButton.click();
		WebElement locationField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.punchh.moes:id/fbrstoresearch/street-city-state-zip")));
		locationField.sendKeys("Guam");
		WebElement guam = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.TextView[@text=\"Guam\"])[2]")));
		guam.click();
		WebElement orderNow = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.Button[@content-desc=\"ORDER NOW\"])[2]")));
		orderNow.click();
		WebElement confirmAddress = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.punchh.moes:id/fbroverlay/confirm-address")));
		confirmAddress.click();
		

	}

}
