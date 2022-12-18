package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3Js {

	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Thread.sleep(2000);
	
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	}	
}
