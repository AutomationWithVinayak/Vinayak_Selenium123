package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXP {
	
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("asdfghjkl");      //by attribute n="attribute v"
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("aqweds@123");  // by contains-- attribute
//		Thread.sleep(3000);
//      driver.findElement(By.xpath("//input[contains(@value,\"Log In\")]")).click();  //by contains-- attribute
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(text(),'Forgot login info?')]")).click();  // by contains -- text
//		Thread.sleep(3000);
//		driver.findElement(By.id("firstName")).sendKeys("tom");
//		Thread.sleep(3000);
//      driver.findElement(By.name("lastName")).sendKeys("jerry");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id=\"address.street\"]")).sendKeys("mp");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@id,\"address.city\")]")).sendKeys("l...");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name=\"address.state\"]")).sendKeys("mh");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@id,\"address.zipCode\")]")).sendKeys("417852");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@name,\"ssn\")]")).sendKeys("147852369");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value=\"Find My Login Info\"]")).click();
		
//		driver.findElement(By.linkText("Register")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("//li[text()='Solutions']")).click();
//		Thread.sleep(3000);
		
		
		
		driver.findElement(By.partialLinkText("About Us")).click();   // by partialinktext()
		Thread.sleep(3000);
		driver.findElement(By.linkText("Services")).click();           // by linktext()
		Thread.sleep(3200); 
		driver.findElement(By.xpath("//a[contains(text(),\"home\")]")).click();  //by contains--- text
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("select#gtranslate_selector")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value=\"en|en\"]")).click();
		
		




		
		
	}

}
