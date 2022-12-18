package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import locator.Is_Select;

public class ListBox1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);

		WebElement day =driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month =driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year =driver.findElement(By.xpath("//select[@id=\"year\"]"));

		Select s1=new Select(day);	
		s1.selectByValue("15");
		Select s2=new Select(month);
		s2.selectByValue("7");
		Select s3=new Select(year);
		s3.selectByValue("1997");
		
		
	}

}
