package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Box_3 {
public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
        
		Thread.sleep(3000);
		
		  driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
        
		  Thread.sleep(3000);
          WebElement day    = driver.findElement(By.xpath("//select[@id=\"day\"]"));
          WebElement Month  = driver.findElement(By.xpath("//select[@id=\"month\"]"));
          WebElement Year   = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
          Thread.sleep(3000);
          String dob= "22-7-2020";   // TestData
          String  date[] = dob.split("-");
          
          //0 - 12
          //1 - 5
          //2- 2016
          
          ListBox(day, date[0]);
          
          ListBox(Month, date[1]);
          
          ListBox(Year, date[2]);
	}
       public static void ListBox(WebElement element, String value) {
	    Select select1 = new Select(element);    
	    select1.selectByValue(value);
}

}