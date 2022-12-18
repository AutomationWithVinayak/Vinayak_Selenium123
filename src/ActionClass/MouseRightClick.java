package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Actions a = new Actions(driver);
		
		WebElement Rclick=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		a.contextClick(Rclick).build().perform(); //-- right click
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Copy')])[2]")).click();
		Thread.sleep(2000);
		
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		
	}
	
}
