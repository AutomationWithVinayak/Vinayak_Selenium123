package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Cross1 {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Parameters("browser")
	@BeforeMethod
	public void LanchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "C://installer//chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(browser.equals("msedge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\installer\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\installer\\geckodriver.exe");
             driver = new FirefoxDriver();
		}
		else if(browser.equals("opera")) {
			System.setProperty("webdriver.opera.driver", "C://installer//operadriver.exe");
			 driver = new OperaDriver();
		}
	}
	
	@Test
	public void verifyTitle() {
	driver.get("https://www.google.com/");
	String ExpectedTitle="Google";
	String ActualTitle=driver.getTitle();
	
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}

}
