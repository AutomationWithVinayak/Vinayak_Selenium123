package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Actions a= new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		WebElement admin =driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement usermanage=driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement user=driver.findElement(By.xpath("//a[@id=\"menu_admin_viewSystemUsers\"]"));

		a.moveToElement(admin).build().perform();
		Thread.sleep(3000);
		a.moveToElement(usermanage).build().perform();
		Thread.sleep(3000);
		a.moveToElement(user).build().perform();
		user.click();
		
		
	}

}
