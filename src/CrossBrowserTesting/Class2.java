package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Class2 {
	
	
	WebDriver driver;
		
	@BeforeMethod
	@Parameters({"URL"})
	       public void Setup(String URL) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
			 driver =new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get(URL);	
	}
	@Test
	@Parameters({"Username","Password","PIN"})
	public void kiteloginpage(String Username,String Password,String PIN) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(Username);
	
			Thread.sleep(2000);
			
			// Enter Password
			driver.findElement(By.id("password")).sendKeys(Password);
			
			// CLick on loginbutton
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			Thread.sleep(2000);
			//Enter PIN
			driver.findElement(By.id("pin")).sendKeys(PIN);
			
			// Enter continue
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			String ExpUserID =  Username;
			
			//Get Uset ID
			String ActualUSerdID = driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
			
			if(ExpUserID.equals(ActualUSerdID)) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
			driver.quit();
			
		}
		@AfterMethod
		public void Teardown() {
			driver.quit();
		}
	

}
