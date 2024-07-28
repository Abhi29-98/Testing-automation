package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://www.facebook.com/");
        	String URL=driver.getCurrentUrl();
        	System.out.println(URL);
        	
        	//driver.manage().window().maximize();
        	
        	Thread.sleep(2000);
        	String abc= driver.getPageSource();
        	System.out.println(abc);
        	
        	driver.navigate().forward();
        	driver.navigate().to("https://www.amazon.in/");
        	driver.navigate().back();
        	
        	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000)); 
        	driver.manage().window().fullscreen();
        	Thread.sleep(1000);
        	driver.close();
        	}

}
