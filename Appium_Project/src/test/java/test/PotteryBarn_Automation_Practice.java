package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PotteryBarn_Automation_Practice {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		Robot r = new Robot();
		int count = 0;

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
