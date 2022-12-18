package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPixcel2{
	
	public static void main(String []args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url ="https://www.awwwards.com/websites/scrolling/";
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,2500)","");
		
		Thread.sleep(2000);
			
		
	}
	
}
