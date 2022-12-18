package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_By_text {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c://Users//hp elitebook//downloads//chromedriver.exe");
	    
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();

	    Thread.sleep(3000);
	    
	   // driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("625fgajh56");
	  //  driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("21ah@541");
	    
	   driver.findElement(By.xpath("//button[text()=\"Log In\"]")).click();    // by text()=
	    
	    
}
}
