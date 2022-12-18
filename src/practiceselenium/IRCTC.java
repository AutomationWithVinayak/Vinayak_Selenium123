package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new  ChromeOptions();
		option.addArguments("--disable-notifications");
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver(option);
		 
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	    driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).click();
	      
	      List<WebElement> totalsize =driver.findElements(By.xpath("//ul[@id=\"pr_id_1_list\"]//li"));
	      System.out.println(totalsize.size());
	      
	      for(int i=0; i<totalsize.size(); i++) {
	    	  
	    	 String a= totalsize.get(i).getText();
	    	 System.out.println(a);
	      }
	  
	  
	  
	}
}