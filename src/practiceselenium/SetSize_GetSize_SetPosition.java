package practiceselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_GetSize_SetPosition {
	
	
		public static void main(String[] args) throws InterruptedException {
			
	        System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://facebook.com/");
		
			Thread.sleep(3000);
			
			Dimension d=new Dimension (300,300);
			
			driver.manage().window().setSize(d);
			
			Thread.sleep(300);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
              System.out.println(driver.manage().window().getSize());	
              
              Thread.sleep(3000);
              
              Point p =new Point (500,620);
              driver.manage().window().setPosition(p);
              
              driver.close();
	}

}
