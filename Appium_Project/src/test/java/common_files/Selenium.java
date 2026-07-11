package common_files;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Selenium {
	
	public static void main(String[] args) throws MalformedURLException {
		
		//launch an apk
		AppiumDriver driver=null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium:automation_name","UIAUtomator2");
		capabilities.setCapability("appium:platform_name","Android");
		capabilities.setCapability("appium:platform_version","14");
		capabilities.setCapability("appium:device_name","Google_Pixel");
		capabilities.setCapability("appium:appPackage","com.android.");
		capabilities.setCapability("appium:app","app-williamssonoma-debug-254.apk");
//		bundleid for iOS
//		app-williamssonoma-debug-254.apk
		URL url = new URL("https:://127.0.0.1:4723/wd/hub");
//		localhost 4723
//		remote: cloudURL+ username+ accessKey
		driver= new AndroidDriver(url, capabilities);
		
	}
	
//	public static DesiredCapabilities capabilityBuilder(DesiredCapabilities capabilities) {
		
		
//	}
	

}
