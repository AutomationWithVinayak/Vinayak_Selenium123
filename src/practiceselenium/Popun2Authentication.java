package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popun2Authentication {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//https://username:passwaord@
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
	}

}
