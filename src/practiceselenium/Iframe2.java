package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
	String text1 =	driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
	System.out.println(text1);
	
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	
String text2 =	driver.findElement(By.xpath("//p[contains(text(),'You can use ')]")).getText();

System.out.println(text2);

driver.switchTo().defaultContent();
Thread.sleep(3000);

int a=driver.findElements(By.tagName("iframe")).size();
System.out.println(a);

		
	}

	
	
	
}
