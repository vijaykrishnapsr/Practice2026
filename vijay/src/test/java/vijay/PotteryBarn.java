package vijay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PotteryBarn {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.potterybarn.com/");
		driver.manage().window().fullscreen();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        
		WebElement dismissBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//span[contains(text(),\"No thanks, I'd like to proceed to the US site\")]")));
		dismissBtn.click();
		WebElement noThanksBtn = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),\"No, Thanks\")]")));
		noThanksBtn.click();

		WebElement accountBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Account')]")));
		accountBtn.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")))
				.sendKeys("vijayakrishnamoorthy.cellasamy@photon.com");
		WebElement continueBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountLoginButton")));
		continueBtn.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("Test@1122");
		WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountLoginButton")));
		signInBtn.click();
		
		
        
	}

}
