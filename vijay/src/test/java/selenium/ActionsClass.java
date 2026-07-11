package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		action.moveToElement(element).perform();
		action.moveToElement(element).contextClick().perform();
		
		WebElement element1 = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		action.moveToElement(element1).doubleClick().perform();	
		
		//manual Drag and Drop
        action.clickAndHold(element).moveToElement(element1).release().build().perform();
        
        action.dragAndDrop(element, element1).perform();
	}

}
