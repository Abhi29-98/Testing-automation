package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class custom {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("1");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("2");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("3");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("4");

  }

}
