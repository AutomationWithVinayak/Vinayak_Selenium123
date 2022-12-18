
package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text1234 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    
	   String s=   driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).getText();
	    
	    System.out.println(s);
	    
	    String Expected_Result ="Log In";
	    System.out.println("Expected_Result is :-- "+Expected_Result);
	    System.out.println("result is  "+s.equals(Expected_Result));
	    
	    
	    
	    
		
	}

}
