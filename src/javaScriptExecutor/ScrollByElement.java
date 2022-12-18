package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		WebElement code = driver.findElement(By.xpath("//h1[contains(text(),'Code Editor')]"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		Thread.sleep(3000);

		String s= "arguments[0].scrollIntoView();";
		
		
		js.executeScript("arguments[0].scrollIntoView();",code);
		
	}

}
