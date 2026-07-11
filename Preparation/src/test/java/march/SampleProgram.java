package march;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'✕')]")));
		WebElement closeIcon = driver.findElement(By.xpath("//span[contains(text(),'✕')]"));
		closeIcon.click();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("iphone17");
		WebElement search = driver
				.findElement(By.xpath("(//button[@title='Search for Products, Brands and More'])[1]"));
		search.click();
		List<WebElement> phoneList = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
		for (WebElement element : phoneList) {
			String iphoneName = element.getText();
			System.out.println(iphoneName);
		}

	}

}
