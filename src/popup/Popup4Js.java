package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4Js {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Thread.sleep(3000);	

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);	
		System.out.println(alert.getText());

		
		Thread.sleep(2300);
		
		alert.sendKeys("Welcome");
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(3000);	



		Thread.sleep(5000);
		
		driver.close();
		
	
}
}
