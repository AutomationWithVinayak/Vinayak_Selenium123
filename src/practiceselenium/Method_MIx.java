package practiceselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_MIx {

public static void main(String[] args) throws InterruptedException {
	

    System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://facebook.com/");
	 
	
	
	String s= driver.getTitle();
	System.out.println(s);
	
	String s1=driver.getCurrentUrl();
	System.out.println(s1);
	
    driver.navigate().to("https://amazon.in/");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    
   
    
    driver.navigate().back();
    
    
    
   driver.navigate().refresh();
 
  driver.navigate().forward();

  
  System.out.println(driver.manage().window().getSize());
  System.out.println(driver.manage().window().getPosition());
  
  
  Point p =new Point(500,500);
  
  driver.manage().window().setPosition(p);
  
  Thread.sleep(3000);
  
  Dimension d =new Dimension(600,400);
  
  driver.manage().window().setSize(d);
  Thread.sleep(2000); 
  
  
  driver.close();
	
	
	
	
	
	
}
	
}
