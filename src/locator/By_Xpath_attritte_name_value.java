package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Xpath_attritte_name_value {
	
	public static void main(String []args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobaile Under 25000 rupees");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@class=\"s-image\"]")).click();
	
	
	
}
}