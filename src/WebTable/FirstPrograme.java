package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrograme {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		  String url= "https://www.w3schools.com/html/html_tables.asp";
		  System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get(url);
	      driver.manage().window().maximize();
	      WebElement element=driver.findElement(By.xpath("//th[text()='Company']"));
	      JavascriptExecutor js =(JavascriptExecutor) driver;
	      
		js.executeScript("arguments[0].scrollIntoView();",element );
		
		
		//first way to find row size
//		int row=driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
//		System.out.println(row);
		
		//second way to find row size
		
		List<WebElement> row1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		System.out.println(row1.size());
		
		// find how many col in tale or col size
		
		int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		
		System.out.println(col);
		
		
		
		
		
		
		
		
	}

}
