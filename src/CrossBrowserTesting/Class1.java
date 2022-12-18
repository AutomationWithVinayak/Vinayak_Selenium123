package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Parameters({"username","pass","pin"})
	@BeforeMethod
	public void Setuo(String URL) {
		System.setProperty("webdriver.chrome.driver", "C://installer//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
	}
	
	@Test
	public void login(String username, String pass, String  pin) {
		
		driver.findElement(By.id("userid")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
