package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	WebDriver driver;
  @Test(dataProvider ="authentication")
  public void login(String PWD, String UID) {
	  driver.findElement(By.id("email")).sendKeys(UID);
	  driver.findElement(By.id("pass")).sendKeys(PWD);
	  driver.findElement(By.id("loginbutton")).click();

  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	  	driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider (name="authentication")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "john", "12355" },
      new Object[] { "abdubey", "@abc" },
    };
  }
}
