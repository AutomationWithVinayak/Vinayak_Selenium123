package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice10 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://app.atherenergy.com/product/450x/testride");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"ui dropdown trit-city-select-input selection\"]")).click();
		Thread.sleep(2000);
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class=\"menu transition visible\"]//div"));
		
		System.out.println(list1.size());
		
		for(int i=0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i).getText());
			
			if(list1.get(i).getText().equals("Nashik")) {
				
				list1.get(i).click();
				break;
			}
		}
		
	
	
	
	
	}
}
