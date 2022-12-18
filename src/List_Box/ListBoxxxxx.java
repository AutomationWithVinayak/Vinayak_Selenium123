package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxxxxx {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Thread.sleep(3000);
		
		
		Select s1 =new Select (day);
		
		List<WebElement> daylist=s1.getOptions();
		System.out.println(daylist.size());
		
		for(int i=0;  i<daylist.size();  i++) {
			String totaldays=daylist.get(i).getText();
			System.out.println(totaldays);
			
			if(totaldays.equals("25")) {
				daylist.get(i).click();
				break;
				
			}
		}
		
		Select s2=new Select(month);
		
		List<WebElement> monthlist=s2.getOptions();
		System.out.println(monthlist.size());
		
		for(int j=0; j<monthlist.size();  j++) {
			
			String totalmonths=monthlist.get(j).getText();
			System.out.println(totalmonths);
			
			if(totalmonths.equals("Feb")) {
				monthlist.get(j).click();
				
				break;
			}
		}
		
		Select s3 =new Select (year);
		
		List<WebElement> yearlist=s3.getOptions();
		System.out.println(yearlist.size());
		
		for(int k=0;  k<yearlist.size();  k++) {
			String totalyears=yearlist.get(k).getText();
			System.out.println(totalyears);
			
			
			if(totalyears.equals("1990")) {
				yearlist.get(k).click();
				break;
			}
		}
		
		
		
		
	}

}
