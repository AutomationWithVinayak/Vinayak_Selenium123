package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains2 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c://Users//hp elitebook//downloads//chromedriver.exe");
	    
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();

	    Thread.sleep(3000);
	    
	    
	   // driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
	    
	    driver.findElement(By.xpath("//input[contains(@class,'nputtext _55r1 _6luy')]")).sendKeys("1234567");
	    
	    
	    	
}
}
