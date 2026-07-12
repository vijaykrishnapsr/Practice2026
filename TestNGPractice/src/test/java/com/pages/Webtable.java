package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table table-striped']//th"));
		int noOfColumns = columns.size();
		System.out.println("No of Columns" + noOfColumns);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']//tr"));
		int noOfRows = rows.size();
		System.out.println("No of Rows - " + noOfRows);
		WebElement firefoxCPU = driver.findElement(By.xpath("//td[normalize-space()='Firefox']//following::td[2]"));
		String cpuValue = firefoxCPU.getText();
		System.out.println("cpuValue of FireFox - " + cpuValue);
	}

}
