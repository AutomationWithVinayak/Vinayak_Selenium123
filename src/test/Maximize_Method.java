package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();
	}

}
