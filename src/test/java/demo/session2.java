package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Register.html");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abhishek");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("dubey");
        driver.close();
        //driver.quit();
        
        
	}}
    	
    	
	