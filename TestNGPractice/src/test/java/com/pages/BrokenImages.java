package com.pages;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("img"));
		int count = 0;
		for(WebElement element:elements) {
		    
			if(element.getAttribute("natural-width").equals(0)) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
