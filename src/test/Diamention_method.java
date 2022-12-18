package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diamention_method {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		
		Dimension s =new Dimension(400,400);
		
		driver.manage().window().setSize(s);
		
		Thread.sleep(3000);
		
		driver.close();
	}
}
