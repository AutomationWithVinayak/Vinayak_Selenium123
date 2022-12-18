package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBordAction {
	
	public static void main(String[] args) throws InterruptedException {	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	Actions a = new Actions(driver);
	
	a.sendKeys(Keys.BACK_SPACE).build().perform();
	
	String t1=driver.findElement(By.id("result")).getText();
	System.out.println(t1);
	
	a.sendKeys(Keys.ESCAPE).build().perform();
	
	String t2=driver.findElement(By.id("result")).getText();
	System.out.println(t2);
	
	
	a.sendKeys(Keys.SPACE).build().perform();
	String t3=driver.findElement(By.id("result")).getText();
	System.out.println(t3);
	
	
	a.sendKeys(Keys.DELETE).build().perform();
	String t4=driver.findElement(By.id("result")).getText();
	System.out.println(t4);
	
	
	a.sendKeys(Keys.ENTER).build().perform();
	String t5=driver.findElement(By.id("result")).getText();
	System.out.println(t5);
	
	
	
	
	
	}
	

}
