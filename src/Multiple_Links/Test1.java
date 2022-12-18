package Multiple_Links;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.zlti.com/");
		driver.manage().window().maximize();
		int brokenurl=0;
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		
		for(WebElement element: Links) {
			
			String url =element.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("URL is Empty");
				continue;
				
			}
			
		URL u = new URL(url);
		
		HttpsURLConnection httpcode=(HttpsURLConnection) u.openConnection();
		httpcode.connect();   ///hit
		
		if(httpcode.getResponseCode()>=400) {
			System.out.println(httpcode.getResponseCode()+url+" --->-"+"URL is Broken ");
			
			brokenurl++;
		}
		else {
			
			System.out.println(httpcode.getResponseCode()+url+" --->-"+"URL is Valid");
		}
			
			
		}
		
		System.out.println(brokenurl);
		
		
	
		
		
		
		
	} 

}
