package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_By_Index_Number {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class=\"nav-a  \"]")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class=\"nav-a  \"][6]")).click();
    Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//a[@class=\"nav-a  \"][10]")).click();
    Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	// below one extra element find by contains
	// driver.findElement(By.xpath("//span[contains(text(),'Hello, Sig')]")).click();    // in that text is :- Hello, Sign in but it handal or egnore thid=s case because of contain use
	

	

}
}

