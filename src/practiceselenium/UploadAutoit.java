package practiceselenium;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadAutoit {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		
		
		WebElement button=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		
		Actions act =new Actions(driver);
		act.moveToElement(button).click().perform();
		
		Thread.sleep(5000);
		
			Runtime.getRuntime().exec("C:\\Users\\hp elitebook\\Desktop\\FileUpload3.exe");
		
		
		
	}

}
