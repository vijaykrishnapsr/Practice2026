package vijay;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TesngPractice {

	@Test(groups="smoke")
	public static void studName()
	{
		System.out.println("Student Name is Arun");
	}

	@Test(groups="sanity")
	@Parameters({"username","password"})
	public static void stdID(String name, String pass)
	{
		System.out.println("Student user name is " +name+ "Password is "+ pass);
	}
    @Test(groups="smoke")
	public static void studPhone() {
		System.out.println("Phone number is 8756558989");
	}
	@Test(groups="regresssion")
	public static void studMark() {
		System.out.println("Mark is 500");
	}



}

