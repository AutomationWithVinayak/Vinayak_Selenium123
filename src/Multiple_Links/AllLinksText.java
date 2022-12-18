package Multiple_Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksText {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		
		System.out.println("total link present in fb :- "+alllinks.size());
		
		for(WebElement LinksInText:alllinks) {
			                                                 //String link = LinksInText.getText(); -- Syso(link);
			System.out.println(LinksInText.getText());
			
			
			
		}
		
		
	}

}
