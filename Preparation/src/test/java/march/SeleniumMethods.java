package march;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethods {
	public static void main(String[] args) throws AWTException, IOException {
		// Basic Webdriver setup methods
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("Current page Title is - " + pageTitle);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url is - " + currentUrl);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='b3wTlE']")));
		WebElement closeIcon = driver.findElement(By.xpath("//span[@class='b3wTlE']"));
		closeIcon.click();
		// driver.close();

		// Navigation commands

		/*
		 * driver.navigate().to(currentUrl); driver.navigate().back();
		 * driver.navigate().forward(); driver.navigate().refresh();
		 */
		// -------------------------------------------------------------------------------------------

		// Action Class - used for mouse over action
		Actions act = new Actions(driver);
		act.moveToElement(closeIcon).click().perform();
		act.moveToElement(closeIcon).perform();
		act.dragAndDrop(closeIcon, closeIcon).perform();
		act.contextClick().perform();
		act.doubleClick().perform();
		WebElement source = driver.findElement(By.id(currentUrl));
		WebElement destination = driver.findElement(By.id(currentUrl));
		act.clickAndHold(source).moveToElement(destination).perform();
		// CONTROL + A, CONTROL + C, CONTROL + V
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		// Scroll to Element - Available in Selenium 4
		act.scrollToElement(destination).perform();
		// -------------------------------------------------------------------------------------------

		// Robot class - “Used Robot class to handle OS-level file upload popup where
		// Selenium cannot interact.”

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);

		// Copy and paste
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// In real-time projects, I avoid Robot for copy-paste
		// and instead use getAttribute and sendKeys for better reliability.

		String inputText = driver.findElement(By.id("currentField")).getAttribute("value");
		driver.findElement(By.id("destination")).sendKeys(inputText);
		// -------------------------------------------------------------------------------------------

		// Alert - An Alert in Selenium WebDriver is a JavaScript popup
		// that appears on the browser and blocks user interaction until handled.

		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys(inputText);
		alert.accept();

		// -------------------------------------------------------------------------------------------

		// Select - The Select class in Selenium is used to handle HTML dropdowns
		// (<select> tag).
		// Select class works ONLY for <select> tag

		WebElement element = driver.findElement(By.id(inputText));
		Select select = new Select(element);
		select.selectByVisibleText("india");
		select.selectByValue("IN");
		select.selectByIndex(1);
		// De-Selection Methods (Multi-select) - De-Selection Methods (Multi-select)
		select.deselectAll();
		select.deselectByIndex(0);
		select.deselectByValue(inputText);
		select.deselectByVisibleText(inputText);

		WebElement firstSelectedOption = select.getFirstSelectedOption();
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		List<WebElement> options = select.getOptions(); // all options
		boolean multiple = select.isMultiple(); // check multi-select

		// -------------------------------------------------------------------------------------------

		// TakesScreenshot - The TakesScreenshot interface in Selenium is an interface
		// used to capture screenshots of the browser window.
		// WebDriver does NOT have screenshot methods - So we use: Typecasting
		// (Downcasting)
		// You are NOT casting object - You are casting reference type
		// Used in TestNG listeners, Cucumber hooks, Cucumber hooks

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\My Redmi 9 Pro max");
		FileUtils.copyFile(src, dest);

		// Element Screenshot (Selenium 4) --> Capture only specific element
		WebElement element1 = driver.findElement(By.id("logo"));
		File src1 = element1.getScreenshotAs(OutputType.FILE);

		// Reporting (Allure / Extent) - Attach to report

		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

		// TakesScreenshot is used to capture browser screenshots for debugging and reporting.
		// Since WebDriver doesn’t provide screenshot methods, we use downcasting.
		// In real-time frameworks, I integrate it with listeners
		// to capture screenshots on failure and attach them to reports.

		// -------------------------------------------------------------------------------------------
		
		// Click using JS
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
		// Scroll Down - scrollBy → Move from current position - If current scroll = 100 ,After execution = 600
		
		js.executeScript("window.scrollBy(0,500)");
		
		// scrollTo → Move to exact position, No matter where you are ,Scroll goes to exact 500px from top
		
		js.executeScript("window.scrollTo(0,500)");
		
		// Scroll to Element
		// scrollIntoView(true) - Aligns element to TOP of the page
		// scrollIntoView(false) - Aligns element to BOTTOM of the page
		// “I use scrollIntoView when element is outside viewport before performing actions.”
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].scrollIntoView(false);", element);
		
		
		// To make the element at the center
		
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
		
		// Scrolling the page from top to bottom
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		// Enter Text
		
		js.executeScript("arguments[0].value='Hello';", element);
		
		// Get Value
		
		String text = (String) js.executeScript("return document.title;");
		String url = (String) js.executeScript("return document.URL");
		
		// -------------------------------------------------------------------------------------------
		
		// Windows Handling

		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles(); // window ID is unique

		for (String win : windowHandles) {

			if (!win.equals(parentWindow)) {
				driver.switchTo().window(win);
			}
		}
		
		// Frames
		
		driver.switchTo().frame(0); 
		driver.switchTo().parentFrame(); // switches to parent frame
		driver.switchTo().defaultContent(); // switches to Main page
		
		// Waits
		// Implicit Wait - Waits for a fixed time globally
		// Applies to all elements
		// Polls DOM automatically
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Explicit Wait - Wait until a specific condition is met
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element1));
		wait.until(ExpectedConditions.visibilityOf(element1));
		wait.until(ExpectedConditions.alertIsPresent());
		
		// Fluent Wait
		// Customized wait with: Polling interval, Exception handling
		
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		
		wait2.until(ExpectedConditions.elementToBeClickable(element));
		
		// -------------------------------------------------------------------------------------------

		
		

		
		

	}
}
