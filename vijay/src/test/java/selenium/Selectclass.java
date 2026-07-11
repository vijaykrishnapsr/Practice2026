package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectclass {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
        
	    driver = new ChromeDriver();
	    driver.get("https://practice.expandtesting.com/dropdown");
	    driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("dropdown"));
		Select s = new Select(dd);
		s.selectByIndex(1);
		s.selectByVisibleText("Option 1");
		s.selectByValue("2");
		s.selectByValue("1");
		s.deselectAll();
		List<WebElement> allSelectedOptions2 = s.getAllSelectedOptions();
		WebElement firstSelectedOption2 = s.getFirstSelectedOption();
		List<WebElement> options = s.getOptions();
		for(WebElement opt : options) {
			System.out.println(opt);
			String text = opt.getText();
			System.out.println(text);
        
		}
        
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();


	}

}
