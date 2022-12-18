package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalFrame4 {

		public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	

			driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			
			
			WebElement outerframe=driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
			driver.switchTo().frame(outerframe);
			Thread.sleep(3000);

			WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
			driver.switchTo().frame(innerframe);
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Vicky");
			Thread.sleep(5000);

			
			driver.close();
		}
	
}
