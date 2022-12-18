package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Thread.sleep(3000);
		
		String d="10-12-1998";
		String [] t=d.split("-");
		
		m(day,t[0]);
		m(month ,t[1]);
		m(year,t[2]);
		
   }

    public static void m(WebElement x , String y) {
    	
    	Select s = new Select(x);
    	s.selectByValue(y);
    	
    }
 
}
