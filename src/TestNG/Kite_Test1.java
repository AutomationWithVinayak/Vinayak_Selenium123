package TestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Kite_Test1 {

	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod   //1  4 7
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");		

	} 
	@Test   //2
	public void Aiteloginpage() {
		String Title =driver.getTitle();
		System.out.println(Title);
	}
	@Test  //5
	public void kitelogoTest() {
		boolean b =driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]")).isDisplayed();
		System.out.println(b);
	}
	@Test  //8
	public void forgetlink() {
		boolean b1=driver.findElement(By.xpath("//a[contains(text(),'Forgot user ID or password?')]")).isDisplayed();
		System.out.println(b1);
	}

	@AfterMethod   //3 6  9
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


}