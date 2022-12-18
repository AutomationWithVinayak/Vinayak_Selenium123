package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxWithoutSelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
			 driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
			Thread.sleep(5000);
			
			String day="//select[@id=\"day\"]//option";
			String month="//select[@id=\"month\"]//option";
			String year="//select[@id=\"year\"]//option";
			Thread.sleep(3000);
			
			String DOB="27-Jun-1998";
			String[] date= DOB.split("-");
			m1(day,date[0]);
			m1(month,date[1]);
			m1(year,date[2]);
			
			
		
		
	}
	public static void m1(String a, String b) {
		List<WebElement>totallist=driver.findElements(By.xpath(a));
		
		System.out.println(totallist.size());
		
		for(int i=0; i<totallist.size();  i++) {
			
			System.out.println(totallist.get(i).getText());
			
			if(totallist.get(i).getText().equals(b)) {
				
				totallist.get(i).click();
				break;
			}
			
			
		}
		
	}

}
