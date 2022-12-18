package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPrime {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
		
		WebElement prime =driver.findElement(By.xpath("(//span[contains(text(),'Prime')])[3]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(prime).build().perform();
	    Thread.sleep(4000);
	    WebElement img =driver.findElement(By.xpath("//img[@id=\"multiasins-img-link\"]"));
		img.click();
		
				
	}
}
