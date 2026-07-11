package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	public static void main(String[] args) {
        
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mcalistersdeli.com/sign-up");
		//driver.manage().window().maximize();
        String currentUrl = driver.getCurrentUrl();
        System.out.println("CurrentURL is : " + currentUrl);
        String title = driver.getTitle();
        System.out.println("Current page Title is : " + title);
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
	}
    
}
