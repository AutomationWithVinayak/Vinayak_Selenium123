package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
	 	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
