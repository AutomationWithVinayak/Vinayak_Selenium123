package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TillScrollTop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		
		//js.executeScript("document.documentElement.scrollTop=0","");
		
		//scrollTop Script
		
		//String script = "window.scrollTo(0,document.body.scrollHeight)";
		
		String script1 = "document.documentElement.scrollTop=0";
		
		js.executeScript(script1,"");
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
