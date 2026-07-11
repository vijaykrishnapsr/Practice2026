package MyMCA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class LaunchApplication {
	
	@Test
	public void launchApp() {
		
	 WebDriverManager driver = new ChromeDriverManager();
	 driver.getBrowserPath();
	 
	WebDriver tdriver = driver.getWebDriver();
	tdriver.get("https://www.potterybarn.com/");
	Assert.assertEquals("Home Furniture, Home Decor & Outdoor Furniture | Pottery Barn ",tdriver.getTitle());
	
	WebElement productEle = tdriver.findElement(By.xpath("(//li/a[contains(text(),'Outdoor')])[6]"));
	productEle.click();
	WebElement outdoorOrder = tdriver.findElement(By.xpath("(//div//a[contains(text(),'Outdoor Furniture Collections')])[3]"));
	outdoorOrder.click();
	WebDriverWait wait = new WebDriverWait(tdriver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Outdoor Collections')]")));
	
	WebElement selectProductCategory = tdriver.findElement(By.xpath("//img[@title='Huntington Collection']"));
	selectProductCategory.click();
	
	
	
	WebElement productPrice = tdriver.findElement(By.xpath("((//span[contains(text(),'Huntington Wicker Square Arm Outdoor Sofa (81\")')])[1]/following::span[@class='amount'])[1]"));
	String price = productPrice.getText().replace(",", "");
	int expectedPrice = Integer.parseInt(price);
	System.out.println("The expected price : " + expectedPrice);
	
	WebElement selectProduct = tdriver.findElement(By.xpath("(//span[contains(text(),'Huntington Wicker Square Arm Outdoor Sofa (81\")')])[1]"));
	selectProduct.click();
	
	
	
	}

}
