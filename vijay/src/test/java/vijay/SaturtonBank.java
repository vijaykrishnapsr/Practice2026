package vijay;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaturtonBank {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.santanderbank.com/");
		//driver.manage().window().fullscreen();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		WebElement findBranch = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Find a Branch/ATM ')]//parent::a")));
		findBranch.click();
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("locator-search-value")));
		search.sendKeys("ca");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']//li[1]"))).click();
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.DOWN).click().keyUp(Keys.UP).perform();
//		driver.findElement(By.id("search-button")).click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement branch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lid2243776")));
		js.executeScript("arguments[0].scrollIntoView(true);", branch);
		driver.findElement(By.xpath("//li[@id=\"lid2243776\"]//following-sibling::span[contains(text(),' Santander Bank | ATM - CVS')]")).click();
		
		

	}

}
