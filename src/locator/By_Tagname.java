package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Tagname {

	public static void main(String[] args) throws InterruptedException {
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("viki");
		driver.findElement(By.tagName("textarea")).sendKeys("adresse tab");
		driver.findElement(By.tagName("select")).click();
	//	driver.findElement(By.tagName("span")).click();
		
	  
		
		
	}		
}
