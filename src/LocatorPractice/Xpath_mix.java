package LocatorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_mix {
	
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("asdfg456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("asdf789");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
		
		
		
		
		
	
	
	
	
	
	
	
	
}

}
