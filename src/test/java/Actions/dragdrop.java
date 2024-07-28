package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Static.html");
	    driver.manage().window().maximize();
	    
	    WebElement src=driver.findElement(By.xpath("//img[@id='angular']"));
	    WebElement dst=driver.findElement(By.xpath("//div[@id='droparea']"));
	    
	    Actions abc=new Actions(driver);
	    abc.dragAndDrop(src, dst).build().perform();

	}

}
