package PallaralTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	
	@Test
	public void TC2() throws InterruptedException {
	
	        //To open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//To maximize browser
			driver.manage().window().maximize();
			//To open flipkart
			driver.get("https://www.google.com/");
			//wait 4sec after opening flipkart
			Thread.sleep(4000);
			//close
			driver.close();
			
			
	}
}
