package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//
//		try {
//
//			driver.get("https://demoqa.com/");
//			driver.manage().window().maximize();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//
//		WebElement elementsClick = driver.findElement(By.xpath("//h5[text()='Elements']"));
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		js.executeScript("arguments[0].scrollIntoView({block:'center'});", elementsClick);
//		elementsClick.click();
//
//		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/a/span"));
//		js.executeScript("arguments[0].scrollIntoView({block:'center'});", checkBox);
//
//		checkBox.click();
		
		
		String s1 = "vijay";
		s1.concat("krishna");
		StringBuffer sb = new StringBuffer("java");
		System.out.println(s1);
		System.out.println(sb.capacity());
	}

}
