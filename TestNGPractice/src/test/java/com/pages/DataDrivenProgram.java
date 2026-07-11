package com.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenProgram {

	WebDriver driver;

	public Object[][] DataReader() throws IOException {
		

		FileInputStream file = new FileInputStream("/Users/vijayakrishnamoorthy.cellasamy/Downloads/MyData.xlsx");
		HSSFWorkbook book = new HSSFWorkbook(file);
		HSSFSheet sheetAt = book.getSheetAt(0);
		int rows = sheetAt.getPhysicalNumberOfRows();
		int columns = sheetAt.getRow(0).getPhysicalNumberOfCells();
		DataFormatter formatter = new DataFormatter();
		Object[][] arr = new Object[rows - 1][columns];
		for (int i = 1; i < rows; i++) {
      
			Row r = sheetAt.getRow(i);

			for (int j = 0; j < columns; j++) {
				arr[i - 1][j] = formatter.formatCellValue(r.getCell(j));

			}

		}
		return arr;

	}

	@DataProvider(name = "LoginData")
	public Object[][] dataProviderMethod() throws IOException {

		return DataReader();

	}

	@Test(dataProvider="LoginData")
	public void LoginTest(String uname, String pswd) {
		
	driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']")).sendKeys(uname);

	}

}
