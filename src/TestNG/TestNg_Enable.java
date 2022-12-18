package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNg_Enable {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");	
	}
	
	@Test(enabled=true)
	public void LoginPage() {
		
		System.out.println(driver.getTitle());
	}
	
	@Test(enabled=false)
	public void kitelogoTest() {
		boolean b =driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
		System.out.println(b);
	}
	
	
	@Test(enabled=false)
	public void forgetlink() {
		boolean b1=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
		System.out.println(b1);
	}
	
	@AfterMethod
	public void logOut() {
	driver.quit();
		
		
	}
	

}
