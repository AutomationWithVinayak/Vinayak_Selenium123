package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {

	public static void main(String[] args) throws InterruptedException {
		
		
    System.setProperty("webdriver.chrome.driver","c://Users//hp elitebook//downloads//chromedriver.exe");
    
    WebDriver driver =new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    
    Thread.sleep(3000);
    
    System.out.println(driver.getTitle()+" : is the title");
    
    String one =driver.getTitle();
    
    String two ="Facebook - log in or sign up";
    
    if(one.equals(two)) {
    	
    	System.out.println("Title is Right");
    }
    else {
    	System.out.println("Tiltle is Wrong");
    }
    driver.close();
    
	}
}
