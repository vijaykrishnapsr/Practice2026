package test;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_files.BaseClass;
import pages.Home_page;

@Test
public class HomePage_test extends BaseClass {
	
	public void startHomepage() throws MalformedURLException {
		startAndroidDriver();
		PageFactory.initElements(driver, Home_page.class);
		btnClick(Home_page.signInBtn);
	}


}
