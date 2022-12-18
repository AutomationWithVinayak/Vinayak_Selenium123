package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
      driver.switchTo().frame("moneyiframe");
  	Thread.sleep(3000);

      
    // driver.switchTo().frame(0);
	
     //WebElement b=	driver.findElement(By.xpath("//iframe[@id=\"moneyiframe\"]"));
     
    //driver.switchTo().frame(b);

	String a=driver.findElement(By.xpath("//span[@id=\"nseindex\"]")).getText();
	System.out.println(a);
	
	}	
}
