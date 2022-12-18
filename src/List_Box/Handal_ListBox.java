package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import locator.Is_Select;

public class Handal_ListBox {
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
	WebElement day=	driver.findElement(By.xpath("//select[@id=\"day\"]"));
	WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
	WebElement year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	Thread.sleep(3000); //--------
	
	String dob="1-12-2001";
	String date []= dob.split("-");
	
	handal(day,date[0]);
	handal(month,date[1]);
	handal(year,date[2]);
	
	
	
	}
	public static void handal(WebElement element , String value) {
	
		Select s=new Select(element);
		s.selectByValue(value);
	}
 
	
	
}
