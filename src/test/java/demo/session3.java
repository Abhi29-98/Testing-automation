package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
        /*driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();   	
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();

        
       driver.close();
       
       
       
       driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       driver.switchTo().alert().accept();*/
	    
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
	    driver.switchTo().alert().sendKeys("API");
        driver.switchTo().alert().accept();


       
       

       
       
    	
	}
	
}
