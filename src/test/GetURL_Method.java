package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL_Method {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		
		if(URL.equals("https://www.facebook.com/")) {
			System.out.println("Right URL");
		}
		else {
			System.out.println("Wrong URL");
	}
		driver.close();
	}
	
}
