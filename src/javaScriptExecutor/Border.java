package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Border {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		m1(logo,driver);
		
	}
	public static void m1(WebElement logoelement , WebDriver d) {
		
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		
		js.executeScript("arguments[0].style.border='10px solid red '", logoelement);
		
		
	}

}
