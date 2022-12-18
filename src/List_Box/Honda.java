package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Honda {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.honda2wheelersindia.com/reach-us/product-enquiry");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement model=driver.findElement(By.xpath("//select[@id=\"ModelID\"]"));
			WebElement state=driver.findElement(By.xpath("//select[@id=\"StateID\"]"));
			WebElement city=driver.findElement(By.xpath("//select[@id=\"CityID\"]"));
			WebElement dealer=driver.findElement(By.xpath("//select[@id=\"DealerID\"]"));
			

			Select s1 = new Select(model);
			s1.selectByValue("1041");
			Thread.sleep(1000);

			Select s2 =new Select(state);
			s2.selectByValue("19");
			Thread.sleep(3000);
			
			Select s3 = new Select(city);
			s3.selectByVisibleText("Buldhana");
			Thread.sleep(1000);

			Select s4 = new Select(dealer);
			s4.selectByVisibleText("Kothari Honda");
			Thread.sleep(1000);

			
			driver.findElement(By.xpath("//select[@id=\"TitleID\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//option[@value=\"Mr.\"]")).click();
			driver.findElement(By.xpath("//input[@id=\"Name\"]")).sendKeys("Vicky");


			
	}
	

	

}
