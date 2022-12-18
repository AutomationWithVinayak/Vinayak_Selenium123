package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Name_ {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("email")).sendKeys("a1b1c2d1");
		driver.findElement(By.name("pass")).sendKeys("a2b2c2d2");
		driver.findElement(By.name("login")).click();
		
		
		
	}
	
	
}
