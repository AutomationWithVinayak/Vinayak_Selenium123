package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG_Priority {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");	
	}

	@Test(priority=6)
	public void loginpage() {

		System.out.println(driver.getTitle());
	}

	@Test(priority=1)
	public void logo() {

		boolean logo=driver.findElement(By.xpath("//img[@alt=\"Kite\"]")).isDisplayed();
		System.out.println(logo);
	}

	@Test(priority=2)
	public void forgotlink() {

		boolean link= driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).isDisplayed();
		System.out.println(link);
	}
	@Test(priority=3)
	public void Test1() {

		System.out.println("Test1");
	}

	@Test(priority=4)
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(priority=5)
	public void Test3() {
		System.out.println("Test3");

	}

	@AfterMethod
	public void TearDown() throws InterruptedException {

		Thread.sleep(4000);
		driver.quit();


	}







}
