package MyMCA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTesting {

	public static WebDriver driver;
	
	@Test
	public void Testng() {
		// TODO Auto-generated method stub
		

	}

	
	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[contains(text(),'Customers’ Most-Loved products')])[1]")));

		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Customers’ Most-Loved products')])[1]"));
		  js.executeScript("arguments[0].scrollIntoView(true);", element);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));


		}
	}

