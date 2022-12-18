package practiceselenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			WebElement a=driver.findElement(By.id("searchDropdownBox"));
			a.click();
			Select s= new Select(a);
			s.selectByVisibleText("Sports, Fitness & Outdoors");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket kit"+Keys.ENTER);
			
		List<WebElement> allResult=driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-4\"]//a//span"));
		System.out.println(allResult.size());
		allResult.get(9).click();
		
		
		
		
//		for(int i=0; i<allResult.size(); i++) {
//			
//			System.out.println(allResult.get(i).getText());
//			
//			String list=allResult.get(i).getText();
//			
//			
//		}
			
			
			
//			driver.findElement(By.xpath("//span[text()='Prime']")).click();
//			driver.findElement(By.xpath("//img[@id=\"multiasins-img-link\"]")).click();
			
		
			
		
		
		
	}

}
