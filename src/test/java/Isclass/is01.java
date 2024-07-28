package Isclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Male']")).isEnabled());
	    
	    System.out.println(driver.findElement(By.xpath("//label[normalize-space()='FeMale']")).isSelected());
	    
	    System.out.println(driver.findElement(By.xpath("//label[normalize-space()='FeMale']")).isDisplayed());
	    
	    System.out.println(driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());
	    
	    System.out.println(driver.findElement(By.xpath("//input[@id='checkbox1']")).isEnabled());

	    driver.close();
	}

}
