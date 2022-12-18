package Practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testcase1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    
	    driver.close();
	}
	
	@Test
	public void testcase2() {
		
		int i=1;
		int div= i/0;
		System.out.println(div);
		
	}

}
