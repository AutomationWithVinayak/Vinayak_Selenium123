package Multiple_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLikns2 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		int brokenlinks = 0;
		
		List<WebElement> list =driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		
		for(WebElement link:list) {
			
			
			String alllinks=link.getAttribute("href");
			
			if(alllinks==null || alllinks.isEmpty()) {
				
				System.out.println("url is empty");
				continue;
				
			}
			
			URL url = new URL(alllinks);
			
			HttpURLConnection httpcode=(HttpURLConnection) url.openConnection();
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400)
			{
				System.out.println(alllinks+"  ---> is a Broken Links");
				
				brokenlinks++;
			}
			else {
				
				System.out.println(alllinks+"  --->  is valid Links");
				
			}
			
				
			
			
			
			
		}
		
		
		System.out.println(brokenlinks);
	}

}
