package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCheckBox {

	public static WebDriver driver;

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().window().maximize();
		WebElement plus = driver.findElement(By.xpath("(//span[@class='plus'])[1]"));
		plus.click();
		WebElement subplus = driver.findElement(By.xpath("(//span[@class='plus'])[1]"));
		subplus.click();
		List<WebElement> boxes = driver.findElements(By.xpath("//ul[@id='bf_l_1']/li/input"));
        
		for(WebElement box : boxes) {
			String attribute = box.getAttribute("id");
				if(attribute.equalsIgnoreCase("c_io_1")) {
        
				}{
				box.click();}

		}




	}

}
