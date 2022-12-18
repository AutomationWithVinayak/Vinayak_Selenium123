package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	
	WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	
	Actions a= new Actions(driver);
	
	a.doubleClick(button).build().perform();
	Thread.sleep(3000);
	
	Alert b=driver.switchTo().alert();
	System.out.println(b.getText());
	
	Thread.sleep(2000);
	b.accept();
	
	Thread.sleep(3000);
	
	driver.quit();
	
	}	
}
