package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kanha {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/hp%20elitebook/Desktop/%C2%A0/Ranjeet%20Sir%20automation/HTML/FormSir.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"Username\"]")).sendKeys("1233456");
		driver.findElement(By.xpath("//input[@type=\"Password\"]")).sendKeys("123456789");
	}

}
