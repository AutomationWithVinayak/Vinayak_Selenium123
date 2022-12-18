package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupSelfHtml2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/hp%20elitebook/Desktop/Vicky/Ranjeet%20Sir%20automation/HTML/Popup22.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//button[text()='Click on me']")).click();
	
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.dismiss();
	
	
	}
	
	
	
	

}
