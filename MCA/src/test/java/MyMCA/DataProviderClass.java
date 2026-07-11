package MyMCA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	
	@Test
	@DataProvider(name = "Testdata")
	public static Object[][] inputData(){
		
		Object[][] data = new Object[] []{{"vijay@gmail.com","Test@123"},
			                        {"mcatest@gmail.com","Test@123"}};
			                        
		return data;
	}
	

}
