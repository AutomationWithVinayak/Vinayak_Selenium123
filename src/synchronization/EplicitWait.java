package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EplicitWait {

	public static void main(String[] args) {
		
		
		String url="https://www.google.co.in/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.get(url);
        driver.manage().window().maximize();
        
        driver.findElement(By.name("q")).sendKeys("Chesse"+Keys.ENTER);
        
       WebElement value= new WebDriverWait(driver,Duration.ofSeconds(12)).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3")));
            
         System.out.println(value.getText());
         
         
            
	}
	
	
}
