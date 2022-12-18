package Multiple_Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlelinks {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Today's Deals")).click();
		
		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("Number Of Links Present :- "+list.size());
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getAttribute("href"));
//		
//		}
		
		for(WebElement links:list) {
			System.out.println(links.getText());
			System.out.println(links.getAttribute("href"));
		}
		
	}

}
