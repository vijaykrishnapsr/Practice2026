package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_files.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class EmulatorTest extends BaseClass {

	public static AndroidDriver driver;
    
	public static void main(String[] args) throws MalformedURLException {
        
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Emulator Device");
		options.setPlatformName("Android");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.setPlatformVersion("16");
		options.setNoReset(false);
		options.setNewCommandTimeout(Duration.ofMinutes(10));
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement continueWithoutIDBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin_fre_dismiss_button")));
		continueWithoutIDBtn.click();
		
		WebElement gotItBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ack_button")));
		gotItBtn.click();
		
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_box_text")));
		searchBox.sendKeys("https://www.mcalistersdeli.com/");
		
		WebElement mcaFirstOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("line_2")));
		mcaFirstOption.click();
		
		WebElement advancedBtn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"details-button\"]")));
		advancedBtn.click();
		
		WebElement proceedToSite = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.TextView[@text=\"Proceed to www.mcalistersdeli.com (unsafe)\"]")));
		proceedToSite.click();

	}

}
