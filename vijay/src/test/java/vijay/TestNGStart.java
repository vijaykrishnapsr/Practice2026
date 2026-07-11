package vijay;

import org.testng.annotations.Test;

public class TestNGStart {


	@Test(enabled=false)
	public void firstTest(){

		System.out.println("First Test");

	}
	@Test(dependsOnMethods="firstTest", alwaysRun=true )
	public void secondTest(){

		System.out.println("Second Test");

	}
	@Test()
	public void thirdTest(){

		System.out.println("Third Test");

	}

}
