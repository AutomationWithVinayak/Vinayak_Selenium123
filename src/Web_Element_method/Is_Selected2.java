package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	    
	    

	    driver.findElement(By.xpath("//input[@id=\"u_3_4_YC\"]")).click();
//	    
//	    
//	    if(driver.findElement(By.xpath("//input[@id=\"u_3_4_YC\"]")).isSelected()==false) {
//	    	
//	    	driver.findElement(By.xpath("//input[@id=\"u_3_4_YC\"]")).click();    
//	    	
//	    }
//	    else {
//	    	System.out.println(driver.findElement(By.xpath("//input[@id=\"u_3_4_YC\"]")).isSelected());
//	    }
//	    
//	    
		
		
	}

}
