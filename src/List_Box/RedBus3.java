package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus3 {
	
	
	
	// redbus---mock--group--
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" ); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		Thread.sleep(5000);

		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		Thread.sleep(4000);

		
		for(int i=0; i<list1.size(); i++) {
			//String totallist= list1.get(i).getText();
			System.out.print(list1.get(i).getText());
			
			if(list1.get(i).getText().equals("Wakad, Pune")) {
				list1.get(i).click();
				break;
				
			}
		}
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Mumbai");
		Thread.sleep(3000);

		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));		
		
		Thread.sleep(2000);

		
		for(int j=0; j<list2.size(); j++) {
			//String totallist2 = list2.get(j).getText();
			System.out.println(list2.get(j).getText());
			

			if(list2.get(j).getText().equals("Thane West, Mumbai")) {
			list2.get(j).click();
				break;
				
				
				
			}
		}
		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		
		
		driver.close();
	}

}
