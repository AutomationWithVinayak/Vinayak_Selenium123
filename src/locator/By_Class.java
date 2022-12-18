package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		WebDriver driver =new ChromeDriver();
	
	
		
	driver.get("https://login.yahoo.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.className("phone-no")).sendKeys("Vinayak@123");
	Thread.sleep(3000);
	driver.findElement(By.className("pure-button")).click();
		
		
	
		
	}

}
