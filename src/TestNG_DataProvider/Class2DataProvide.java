package TestNG_DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class2DataProvide {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test(dataProvider = "TestData")
	public void login(String username , String password) {
		
		System.setProperty("webdriver.chrome.driver", "C://installer//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		
		
	}
	
	
	@DataProvider(name="TestData")
	public Object[][] TestData() {
		
		Object data[][]=new Object[4][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="admin";
		data[1][1]="admin123";
		
		data[2][0]="Admin";
		data[2][1]="Admin123";
				
		data[3][0]="admin";
		data[3][1]="Admin123";
		
		return data;
		
	}

}
