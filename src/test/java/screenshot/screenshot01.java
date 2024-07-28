package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    
	    TakesScreenshot rc=((TakesScreenshot)driver);
	    File src =rc.getScreenshotAs(OutputType.FILE);
    
	    File dest=new File("C:\\Users\\abhdu\\eclipse-workspace\\Project001\\Screenshot\\pic.png");
			
	    try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
