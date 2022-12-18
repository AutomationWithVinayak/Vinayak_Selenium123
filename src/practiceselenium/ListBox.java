package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in/reach-us/product-enquiry");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement a=	driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[3]/div[1]/div/div/div[3]/iframe"));
	driver.switchTo().frame(a);
		
		driver.findElement(By.xpath("/html/body/form/div[3]/input[1]")).sendKeys("Vicky");
		
		driver.findElement(By.xpath("/html/body/form/div[3]/input[2]")).sendKeys("Vinayak"); 	 	
		
		driver.findElement(By.xpath("//*[@id=\"txtMobile\"]")).sendKeys("7775933667");	
		
		//List<WebElement> totalodel = driver.findElements(By.xpath("//select[@id=\"ddlModel\"]//option"));
		WebElement model=driver.findElement(By.xpath("/html/body/form/div[3]/select[1]"));
		
		Select s1 = new Select(model);
		
		s1.selectByVisibleText("New Glamour");
		
	}

}
