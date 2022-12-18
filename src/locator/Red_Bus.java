package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("pune");
      	Thread.sleep(3000);
 		driver.findElement(By.xpath("//li[@data-no=\"2\"]")).click();
 		Thread.sleep(3000);
     	driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("mumbai");
		Thread.sleep(3000);
      	driver.findElement(By.xpath("//li[@data-id=\"462\"]")).click();
     	Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Date')]")).click();
      	Thread.sleep(3000);
  		driver.findElement(By.xpath("//td[@class=\"wd day\"][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@id,'search_btn')]")).click();
		
	
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		//driver.close();
	}
}
