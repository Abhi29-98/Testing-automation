package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Test1 {
	WebDriver driver;
	Actions act;
	
  @Test
  public void mover() throws InterruptedException {
	  
	  WebElement et=   driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
		Thread.sleep(2000);
		Actions act=new  Actions(driver);
		act.moveToElement(et).build().perform();
  }
  
  @Test
  public void rclick() throws InterruptedException {
	  
	  WebElement abc=   driver.findElement(By.xpath("//span[normalize-space()='Buses']"));
		Thread.sleep(2000);
		Actions act=new  Actions(driver);
		act.contextClick(abc).build().perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
  	driver.get("https://www.yatra.com/");
	    driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}


