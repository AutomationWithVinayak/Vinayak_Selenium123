package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbDriver_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(4000);
		
	       String Title =driver.getTitle();
	    		   
	    		   String TitlePahije= "Facebook - log in or sign up";

	    	if(Title.equals(TitlePahije)) {
	    		
	    		System.out.println("ok");
	    	}
	    	else {
	    		System.out.println("wrong");
	    	}
	    	driver.close();
	    	 
	}
	
}
