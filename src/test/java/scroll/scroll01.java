package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Thread.sleep(1000);
	    //scroll by pixel
        //js.executeScript("window.scrollBy(0,8000)", "");*/
        
        // view element till
       // WebElement abc =driver.findElement(By.id("firstpassword"));
        //js.executeScript("arguments[0].scrollIntoView()", abc);
        
	    //scroll to bottom of the page
	    js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)", "");
	}

}
