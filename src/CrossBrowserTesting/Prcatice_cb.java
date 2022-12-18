package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Prcatice_cb {
	

	 WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public  void Setup(String browser) {
	
		
		
		if(browser.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C://installer//chromedriver.exe");
			driver = new  ChromeDriver();
			
		}
		
          else if(browser.equals("msedge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\installer\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\installer\\geckodriver.exe");
             driver = new FirefoxDriver();
			
		}
		
	}
	
	
	@Test
	public  void  Test1() {
		
		driver.get("https://www.google.com/");
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}

}
