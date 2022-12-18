package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mock20 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
	WebElement day=	driver.findElement(By.xpath("//select[@id=\"day\"]"));
	
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	
	WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	
	Thread.sleep(3000);                   
	
	String date = "15-May-1998";
	
	String [] dob =date.split("-");  
	m1(day,dob[0]);
	m1(month,dob[1]); 
	m1(year,dob[2]);
	
	
	}
	public static void m1(WebElement a, String b) {
		
		Select s1 = new Select(a);
		s1.selectByVisibleText(b);
		
	}
	
	
	

}
