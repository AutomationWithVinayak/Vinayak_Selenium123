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
public class BrokenLinks_Practice {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println(links.size());

//		for(int i =0; i<=links.size(); i++) {
		
//           String url=links.get(i).getAttribute("href");
//		}
		
		
		int brokenlinks=0;
		
		for(WebElement url:links) {
			
			String AllURL=url.getAttribute("href");
			
			
			if(AllURL.equals(null) || AllURL.isEmpty()) {
				
				System.out.println("Empty Url");
				
				continue;
			}
			
			URL U = new URL(AllURL);
			
			HttpsURLConnection httpcode =(HttpsURLConnection) U.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=400) {
				System.out.println("URL Is Broken > " +AllURL+" > "+httpcode.getResponseCode());
				
				brokenlinks++;
			}
			else {
				System.out.println("links is valid > "+AllURL+" > "+httpcode.getResponseCode());
			}
		}
		
		System.out.println(brokenlinks);
	}
}
