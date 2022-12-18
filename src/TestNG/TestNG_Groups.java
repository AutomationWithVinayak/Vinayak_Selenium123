package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG_Groups {

	WebDriver driver;
  
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");		


	}
	@Test(priority=6,groups="vk")
	public void LoginPage() {

		System.out.println(driver.getTitle());
	}
	@Test(priority=5,groups="vk" )
	public void Logo() {

		boolean b=driver.findElement(By.xpath("//img[@alt=\"Kite\"]")).isDisplayed();
		System.out.println(b);

	}

	@Test(priority=4,groups="kv")
	public void link() {

		boolean b1=driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).isDisplayed();
		System.out.println(b1);
	}
	@Test(priority=3,groups="kv")
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority=2,groups="kv")
	public void test2() {
		System.out.println("test2");

	}

	@Test(priority=1,groups="vk")
	public void test3() {
		System.out.println("test3");

	}

}
