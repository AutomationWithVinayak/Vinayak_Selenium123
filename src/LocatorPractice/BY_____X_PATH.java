package LocatorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BY_____X_PATH {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//x-path by attribute name='atribute value'
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("147258369");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("852963");
		//driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls9\"]")).click();
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	//	driver.navigate().back();
		//driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUyOTg0ODExLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login\"]")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
	}

}
