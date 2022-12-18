package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_attribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c://Users//hp elitebook//downloads//chromedriver.exe");
	    
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	  //  driver.get("https://www.instagram.com/accounts/login/");
	    
	 //   Thread.sleep(3000);
	    
	  //  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("12345678");
	    
	   
	   // driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	//	driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("7775933667");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("v5jh");
		//Thread.sleep(3000);
		
		
	//  driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
	  // Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUyODQwNDU5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login\"]")).click();
	   
		
		//driver.findElement(By.linkText("Forgotten password?")).click();   // forgotten password
	
	
	
	
	
	
        //driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
		
	}
}
