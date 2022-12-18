package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Close_GetTile_GetUrl_Maximize_Navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		String s= driver.getTitle();
		
		System.out.println(s);
		
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		if(s.equals("Facebook – log in or sign up")) {
			System.out.println("Title is right");
		}
		else {
			System.out.println("title is wrong");
		}
		
		
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		
		
		driver.close();
		
		
		
	}
	}
	


