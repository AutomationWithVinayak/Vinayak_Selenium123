package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_CSS_Selector {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
	
	ChromeDriver driver =new ChromeDriver();
	
	driver.get("https://app.hubspot.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);

	driver.findElement(By.cssSelector("#username")).sendKeys("123456");
//	driver.findElement(By.cssSelector("input#password")).sendKeys("147258369");
	driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("852963");
	
	
}
}