package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryyy {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
			 WebDriver driver =new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/nested_frames");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			

			
			
			
			


}
}