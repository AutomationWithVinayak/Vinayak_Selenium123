package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_LinkText {
	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("Log In")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Forgotten password?")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Create New Account")).click();
	
	
	
	

}
}