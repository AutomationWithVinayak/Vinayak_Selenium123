package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {
	
	public static void main(String[] args) throws InterruptedException {
		
	
        System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		boolean value =	driver.findElement(By.xpath("(//input[@class='_8esa'][1])")).isSelected();
		System.out.println(value);
		if(value==true)
		{
		System.out.println("Radio button selected");
		}
		else
		{
		System.out.println("Radio button is not selected");
		}
		}
		
	}


