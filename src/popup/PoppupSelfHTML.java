package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoppupSelfHTML {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/hp%20elitebook/Desktop/Vicky/Ranjeet%20Sir%20automation/HTML/Bkkhhh.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[text()='Click on me']")).click();
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	WebElement text=driver.findElement(By.xpath("//p[text()='Click the button to display an alert box.']"));
	
	String text1=text.getText();
	System.out.println(text1);
	
	}
}
