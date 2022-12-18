package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandle {
	
	
	
		public static void main(String[] args) throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		//WebElement a=driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));	
		WebElement c=driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));	
		
//		driver.switchTo().frame(0);
//		Thread.sleep(6000);
		driver.switchTo().frame(c);
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		
		
		String b=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(b);
		
		Thread.sleep(4000);
		
	
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame(c);
		Thread.sleep(6000);
		
		driver.switchTo().frame("frame-middle");
		Thread.sleep(5000);
		
		String z=driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(z);
		
		
		
		
		
		
		driver.close();
		
		}

}
