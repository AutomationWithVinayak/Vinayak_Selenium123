package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBord1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement input1=driver.findElement(By.id("inputText1"));
		WebElement input2=driver.findElement(By.id("inputText2"));
		
		input1.sendKeys("Hello copy mi paste in next tab");
		
		Actions a = new Actions(driver);
	   a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
	   Thread.sleep(3000);
	   a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	   Thread.sleep(3000);
	  
	   a.sendKeys(Keys.TAB).build().perform();
	   a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) {
			System.out.println("correct copy and paste");
		}
		else {
			System.out.println("Not copied");
		}
		
		Thread.sleep(4000);
		driver.close();
	}

}
