package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableForLoop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.w3schools.com/html/html_tables.asp");
	      driver.manage().window().maximize();
	      
	      int row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
	      int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
	      System.out.println(row);  System.out.println(col); System.out.println();
	      
	      
	      for(int i=2; i<=row; i++) {
	    	  for(int j=1; j<=col; j++) {
	    		 
	    		String data= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+" | ";
	    		System.out.print(data);
	    	 }
	    	  
	    	 System.out.println();
	    	 
	      }	     
	}
}
