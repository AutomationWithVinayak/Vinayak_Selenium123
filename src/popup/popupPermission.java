package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popupPermission {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new  ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver(option);
		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(3000);
		
		
		
		
		
		
	}

	
}
