package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {

	//mouse RightClick
	
	public static void main(String[] args) throws InterruptedException {	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	
	
	Actions a = new Actions(driver);

    WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	a.contextClick(button).build().perform();
	
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	
	driver.switchTo().alert().accept();
	
	
	
	
	
	
}
}