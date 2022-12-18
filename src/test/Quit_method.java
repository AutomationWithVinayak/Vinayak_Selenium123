package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","c://Users//hp elitebook//downloads//chromedriver.exe");
	    
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	    
	    Thread.sleep(3000);
	    
	   driver.quit();
	    
	    
		
	}

	
		
	}


