package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxxxx {      

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
	System.out.println();
	
	
	System.out.println("____________________________1st step__________________________________");
	Select s1=new Select(day);
	List<WebElement> listday=s1.getOptions();
	System.out.println("total days in list :- "+listday.size());
	System.out.println();
	
	System.out.println("_______________________________2nd step_________________________________________");
	for(int i=0; i<listday.size(); i++) {
		String totalday=listday.get(i).getText(); 
		System.out.println(totalday);
		
		
		if(totalday.equals("10")) {             
			listday.get(i).click();
			break;
		}
			
			}
		
	
	Select s2= new Select(month);
	
	List<WebElement>listmonth=s2.getOptions();
	
	System.out.println(listmonth.size());
	
	for(int j=0; j<listmonth.size();  j++) {
		String totalmonth=listmonth.get(j).getText();
		System.out.println(totalmonth);
		
		if(totalmonth.equals("Feb")) {
			listmonth.get(j).click();
			break;
		}
		
	}
	
	Select s3=new Select(year);
	List<WebElement> listyear =s3.getOptions();
	System.out.println();
	System.out.println("total year :- "+listyear.size());
	System.out.println();
	
	
	for(int k=0; k<listyear.size(); k++) {
		String totalyear=listyear.get(k).getText();
		System.out.println(totalyear);
		
		if(totalyear.equals("1996")) {
			
			listyear.get(k).click();
			break;
		}
	
	}
 
}
	
}	

