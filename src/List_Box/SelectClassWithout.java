package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassWithout {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(4000);
		
		List<WebElement> daylist=driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
		System.out.println(daylist.size());
		
		for(int i=0;  i<daylist.size();  i++) {
			System.out.println(daylist.get(i).getText());
			
			if(daylist.get(i).getText().equals("15")) {
				daylist.get(i).click();
				break;
			}
		}
	}
}
