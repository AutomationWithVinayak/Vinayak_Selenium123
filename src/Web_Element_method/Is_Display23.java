package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Display23 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	   boolean b= driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
	    
		System.out.println(b);
		
		
		
	}
}
