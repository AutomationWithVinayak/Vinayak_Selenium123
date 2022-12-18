package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
			
			String Url="https://www.facebook.com/";
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//WebElement a=driver.findElement(By.xpath("//input[@id=\"email\"]"));
			
			
			WebElement email=new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
			email.sendKeys("Vinayak");
			
			
			
			}
	
	
//	public static void sendKeys(WebDriver driver1, WebElement element, int time, String value){
//		new WebDriverWait(driver1, time).until(ExpectedConditions.visibilityOf(element));
//		element.sendKeys(value);
//		}

}
