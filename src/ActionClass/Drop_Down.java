package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement peackup=driver.findElement(By.id("box3"));
		WebElement drop=driver.findElement(By.id("box103"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(peackup, drop).build().perform();
		Thread.sleep(3000);
		
		WebElement peackup1=driver.findElement(By.id("box7"));
		WebElement drop1=driver.findElement(By.id("box107"));

		a.dragAndDrop(peackup1, drop1).build().perform();
		
		
	}
	
}
