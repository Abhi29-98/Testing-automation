import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhdu\\eclipse-workspace\\Project001\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\abhdu\\Downloads\\ManualtestingNotes.pdf");

	}

}
