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

public class BrokenLink {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		int brokenlink=0;
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	for(WebElement l:links) {
		
		String AllLinkText=l.getAttribute("href");
		System.out.println(AllLinkText);
		
		
		if(AllLinkText==null || AllLinkText.isEmpty()) {
			
			System.out.println("URL is  Empty ");
			continue;
		}
		
		URL url = new URL(AllLinkText);
		
		HttpURLConnection httpcode=(HttpURLConnection) url.openConnection();
		
		httpcode.connect();
		
		if(httpcode.getResponseCode()>=400) {
			
			System.out.println(AllLinkText+" "+httpcode.getResponseCode()+" ..> is a Broken Link ");
			
			brokenlink++;
		}
		
		else {
			System.out.println(AllLinkText+" " +httpcode.getResponseCode()+"  ..> is a valid link");
		}
		
		
	}
	
	System.out.println(brokenlink);
	
	
	//___________________________________//
	
	
	

} 


}