package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


       public class Myntra {
    	   public static void main(String[] args) throws InterruptedException {
			
    		   
    		   ChromeOptions option = new ChromeOptions();
    			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver(option);
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//span[@class=\"myntraweb-sprite desktop-iconUser sprites-headerUser\"]")).click();
	driver.findElement(By.xpath("//a[@data-reactid=\"865\"]")).click();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@class=\"form-control mobileNumberInput\"]")).sendKeys("7775933667");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]")).click();
	
	option.addArguments("--disable-notifications");
	
}
}