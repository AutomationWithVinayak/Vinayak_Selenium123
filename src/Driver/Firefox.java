package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\installer\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
    
	
	}
}
