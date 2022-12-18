package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalFrame8 {
	
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");  //-//set the location of chrome browser from the local machine path
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
    WebElement one =driver.findElement(By.xpath("//div[@id=\"frame1Wrapper\"]//iframe")); //------for focus
	driver.switchTo().frame(one);
   // driver.switchTo().frame(0);                                                                //----//Switch to Frame using Index
    Thread.sleep(2000);
    
   WebElement two= driver.findElement(By.xpath("//h1[text()='This is a sample page']"));                              //----Identifying the heading in webelement
   String a=two.getText();
   System.out.println(a);
   Thread.sleep(3000);
   
   
   driver.quit();
   
   
   
}
}