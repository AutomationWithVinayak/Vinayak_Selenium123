package Multiple_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSize {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/hp%20elitebook/Desktop/Vicky/Ranjeet%20Sir%20automation/HTML/CheckBoxRanjeetSir.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));	
		
		int viki=list.size();
		System.out.println(viki);
		
		
	}
	
	
	
	

}
