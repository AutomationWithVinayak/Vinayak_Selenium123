package POM_With_PageFactory_WithOut_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLogin_Test {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(p);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		

		KiteZerodha_LoginPage1 page1 = new KiteZerodha_LoginPage1(driver);
		page1.EnterUserId();
		page1.EnterPassword();
		page1.ClickOnLoginButton();
		
		KiteZerodha_LoginPage2 page2 = new KiteZerodha_LoginPage2(driver);
		page2.EnterPin();
		page2.ClickOnContinueButton();
		
		
		KiteZerodha_HomePage homepage =new KiteZerodha_HomePage(driver);
		homepage.VerifyUserId();		
		
		
	//	driver.quit();
		
		
		
	}

}
