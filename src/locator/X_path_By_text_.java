package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_By_text_ {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("aabbccdd");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("jfhkdd56");
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); //---( by [text()-' **** ');
		 
		
		
		
		
		
	}

}
