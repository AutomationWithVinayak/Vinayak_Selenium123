package practiceselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MahavirSir {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in/reach-us/product-enquiry");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		
		WebElement one= driver.findElement(By.xpath("//div[@class=\"suggestionformPan\"]//iframe"));
		
		driver.switchTo().frame(one);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id=\"txtFname\"]")).sendKeys("Vicky");
		driver.findElement(By.xpath("//input[@id=\"txtLname\"]")).sendKeys("Vinayak");
		driver.findElement(By.xpath("//input[@id=\"txtMobile\"]")).sendKeys("7775933667");
		
		
		WebElement totalmodel =driver.findElement(By.xpath("//select[@id=\"ddlModel\"]"));
		
		Select s1= new Select(totalmodel);
		s1.selectByVisibleText("Pleasure+ XTEC");

}
}