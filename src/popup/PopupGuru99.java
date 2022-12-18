package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupGuru99 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("sbi");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();	
	
	Thread.sleep(3000);
	
	Alert alt = driver.switchTo().alert();
	
	String text = alt.getText();
	System.out.println(text);
	
	Thread.sleep(3000);
	
	alt.accept();

	
	driver.close();
	
	
	
	
	
	
	
	
		
	}
	
}
