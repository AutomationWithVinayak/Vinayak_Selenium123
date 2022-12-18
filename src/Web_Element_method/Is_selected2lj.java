package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected2lj {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("file:///C:/Users/hp%20elitebook/Desktop/%C2%A0/Ranjeet%20Sir%20automation/HTML/LoginFormComplete2.html");
        driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
        driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected();
        
       
		if(driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected()==false) {
			
			driver.findElement(By.xpath("//input[@id=\"Male\"]")).click();
		}
		else {
			System.out.println(driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected());
		}
		
		System.out.println(driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected()+"  is the result");
		
		
			Thread.sleep(4000);
			
			
			
			
        
        driver.close();
	}

}
