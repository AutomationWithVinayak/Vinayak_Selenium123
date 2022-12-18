package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAction2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);	
		
		
		WebElement path=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].click()", path);
		
		String s= "arguments[0].click()";
		
		js.executeScript(s, path);
		
		
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
