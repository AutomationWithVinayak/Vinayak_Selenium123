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

public class BrokenLinks {
	
	 @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			int brokenlinks=0;
		 
			List<WebElement> Links=driver.findElements(By.tagName("a"));
		 
			System.out.println(Links.size());
			
			for(WebElement element:Links) {
				
	            String url=element.getAttribute("href");
	            
	            if(url==null || url.isEmpty()) {
	            	System.out.println("URL is Empty ");
	            	
	            	continue;      
	            
	            }
   	            
	  
	            
	            
	            URL link =new URL(url);
	            
	            HttpURLConnection httpcode=(HttpURLConnection) link.openConnection();
	            httpcode.connect();
	            
	            if(httpcode.getResponseCode()>=400) {
	            	
	     
	            	
	            	System.out.println(httpcode.getResponseCode()+"--->-"+url+" is --->-"+"Broken Links");
	            	
	            	brokenlinks++;
	            	
	            }
	            else {
	            	
	            	System.out.println(httpcode.getResponseCode()+"--->-"+url+" is--->-"+"Valid Links");
	            	
	            }
	            
			}
			System.out.println("Number of Broken Links :- "+brokenlinks);
			
			
			
		 
	}

}
