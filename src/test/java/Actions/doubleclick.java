package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    
	    WebElement ghi=driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
	    
	    Actions ef=new Actions(driver);
        ef.doubleClick(ghi).build().perform(); 
        
	}

}
