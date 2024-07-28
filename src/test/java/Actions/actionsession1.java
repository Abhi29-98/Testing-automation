package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsession1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://www.yatra.com/");
	    driver.manage().window().maximize();
	    /*WebElement abc=driver.findElement(By.xpath("//a[@id='booking_engine_hotels']//div"));
	    
        Actions dk = new Actions(driver);
        dk.contextClick(abc).build().perform();*/
	    
	    WebElement def=driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        
        Actions ab=new Actions(driver);
        ab.moveToElement(def).build().perform(); 
	    
       
        
	}

}
