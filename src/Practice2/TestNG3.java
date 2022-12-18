package Practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG3 {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://kite.zerodha.com/");	
		
	}
	
	@Test
	public void GetTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void KiteLogo() {
		
		driver.findElement(By.xpath("//h2[text()='Login to Kite']")).isDisplayed();
	}
	
	
	

}
