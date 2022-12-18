package testNg_Assertion;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HerdAssertion {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void UserName() throws InterruptedException {
		
		WebElement UserName=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		WebElement Password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		
		// assertTrue
		
		Assert.assertTrue(UserName.isDisplayed());
		UserName.sendKeys("GP8097");
		Thread.sleep(3000);
		
		Assert.assertTrue(Password.isDisplayed());
		Password.sendKeys("gms@0110");
		
		driver.findElement(By.xpath("//button[contains(text(),'Login ')]")).click();
	
		
	}
	@Test(enabled=false)
	public void Pass() throws InterruptedException {
		
		//assertFlase
		WebElement User = driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		Assert.assertFalse(User.isDisplayed());
		User.sendKeys("GP8097");
		Thread.sleep(3000);
		
		Assert.assertFalse(pass.isDisplayed());
		pass.sendKeys("gms@0110");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}
	
	@Test
	public void kiteLogo() {
		
		boolean b=driver.findElement(By.xpath("//h2[text()='Login to Kite']")).isDisplayed();
		
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
		
		
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	
	
	
	
}
