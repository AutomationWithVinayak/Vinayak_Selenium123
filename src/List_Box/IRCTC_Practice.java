package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Option =new ChromeOptions();
		Option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(Option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).click();
	    
		List<WebElement>TotalStation=driver.findElements(By.xpath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c58-8\"]//li//span"));
	
		System.out.println("Total Staion is :- "+TotalStation.size());
		
		
		for(int i=0; i<TotalStation.size(); i++) {
			
			System.out.println(TotalStation.get(i).getText());
			
			if(TotalStation.get(i).getText().equals("AMRITSAR JN - ASR")) {
				
				TotalStation.get(i).click();
				break;
				
			}
		}
	    
		
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@class=\"ng-tns-c58-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted\"]")).click();
	
	List<WebElement> ToStation =driver.findElements(By.xpath("//ul[@class=\"ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-tns-c58-9\"]//li//span"));
	
	System.out.println("total dest station :- "+ToStation.size());
	
	for(int j=0; j<ToStation.size(); j++) {
		System.out.println(ToStation.get(j).getText());
		
		if(ToStation.get(j).getText().equals("AURANGABAD - AWB")) {
			ToStation.get(j).click();
			break;
			
		}
		
	}
	
	
	
	}
	
	

}
