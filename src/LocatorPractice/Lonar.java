package LocatorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lonar {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		    WebDriver driver =new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("8421648959");
		    driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("jadhav#1111");
		    
		    driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		    
		    
		    
		    
		    
	}

}
