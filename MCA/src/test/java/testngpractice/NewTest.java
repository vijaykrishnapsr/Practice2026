package testngpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(priority=0, invocationCount=4)
  public void firstmethod() {
	  System.out.println("first method");
  }
  @Test
  public void secondmethod() {
	  System.out.println("second method");
	  
	  
  }
 // @Test(enabled=true, dependsOnMethods="firstmethod")
  @Test
  public void skipmethod() {
System.out.println("Skiped method");
}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@BeforeSuite");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

}
