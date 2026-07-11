package vijay;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ListenPractice {


	@Test
	public void stud() {
		String name="arun";
		System.out.println("Name is Arun");
		Assert.assertEquals(name, "arun");
		Assert.assertNotEquals(name, "Vijay");
	}

	@Test(retryAnalyzer = vijay.Retryanalyze.class)
	public void age() {

		String name ;

		int age = 24;
		boolean a = true;

		SoftAssert asert = new SoftAssert();
		asert.assertEquals(age, 25);
		System.out.println("Age is 24");
		asert.assertTrue(a);
		System.out.println("Expected true");
		//asert.assertNull(name);
		System.out.println("Expected true");
		asert.assertAll();
	}


}
