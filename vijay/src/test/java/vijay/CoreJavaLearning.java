package vijay;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CoreJavaLearning {
	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		int count = 0;
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://mca.uat.focusbrands.com/");
        
		System.out.println("Started");
		for (int i = 0; i < 1000; i++) {
			count++;
			Thread.sleep(30000);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			Thread.sleep(30000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println(count);
        
		}
	}

}
