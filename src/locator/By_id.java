package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_id {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement ab = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	
	ab.sendKeys("bighftffg");
	
	Thread.sleep(4000);
	
	ab.clear();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.findElement(By.id("email")).click();
//	driver.findElement(By.id("email")).sendKeys("123456");
//	driver.findElement(By.id("pass")).click();
//	driver.findElement(By.id("pass")).sendKeys("123456789");
//	
	
	
	
	
	
	
	
	 

}
}
