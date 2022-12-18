package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		
		
		driver.findElement(By.id("email")).sendKeys("vicky");
		driver.findElement(By.id("pass")).sendKeys("vinayak");
		driver.findElement(By.xpath("//button[text()='Log I']")).click();   // if n  (button[text()='Log In') in xpath is missimg it will wait 10 sec then show error 
		
		
		
	}
	

}
