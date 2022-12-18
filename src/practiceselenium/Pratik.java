package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pratik {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.atherenergy.com/product/450x/testride");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
			driver.findElement(By.xpath("//*[@id=\"js-page-testride\"]/div[2]/div[1]/div/div/div")).click();
		
		List<WebElement> list =driver.findElements(By.xpath("//*[@id=\"js-page-testride\"]/div[2]/div[1]/div/div/div/select/option"));
		
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("aurangabad")) {
				list.get(i).click();
				break;
				
			}
		}
		
		
		
	}
}
