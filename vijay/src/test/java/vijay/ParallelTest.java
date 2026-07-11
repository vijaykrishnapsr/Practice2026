package vijay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	public static WebDriver driver;

	@Test
	public void launchChromeBrowser() {
		System.out.println(Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://beta.mcalistersdeli.com/");
	    driver.manage().window().maximize();
	}

	@Test
	public void launchFirfoxBrowser() {
		System.out.println(Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://beta.mcalistersdeli.com/");
	    driver.manage().window().maximize();

	}

}
