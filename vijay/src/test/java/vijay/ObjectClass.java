package vijay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectClass {

	public static WebDriver driver;

	public static void clickByid(String id) {

		driver.findElement(By.id(id)).click();

	}

	public static void clickByname(String name) {

		driver.findElement(By.name(name)).click();

	}


	public static void clickByxpath(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	public static void clickByclassName(String ClassName) {

		driver.findElement(By.className(ClassName)).click();

	}

	public static void clickBycss(String CssSelector) {

		driver.findElement(By.cssSelector(CssSelector)).click();

	}

	public static void sendValuebyId(String id, String value) {

		driver.findElement(By.id(id)).sendKeys(value);
	}


	public static void sendValuebyName(String name, String value) {

		driver.findElement(By.name(name)).sendKeys(value);
	}

	public static void sendValuebyXpath(String xpath, String value) {

		driver.findElement(By.xpath(xpath)).sendKeys(value);
	}



}
