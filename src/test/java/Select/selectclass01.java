package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    
	    WebElement abc=driver.findElement(By.xpath("//select[@id='Skills']"));
	    
        Select sel = new Select(abc);
        //sel.selectByIndex(1);
        //sel.selectByVisibleText("C");
        sel.selectByValue("Adobe Photoshop");
        
       // driver.close();        
	}

}
