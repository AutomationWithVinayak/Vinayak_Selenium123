package test;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Postion_mwthod {

	
	public static void main(String[] args) throws InterruptedException  {
		
System.setProperty("webdriver.chrome.driver","c://Users//hp elitebook//downloads//chromedriver.exe");
	    
	    WebDriver driver =new ChromeDriver();
	    
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    
	    Thread.sleep(3000);
	    
	    	Point p =new Point(500,600);
	    	driver.manage().window().setPosition(p);
	    	
	    	Thread.sleep(3000);
	    	
	    	driver.close();
	    	
	    	
	    	
	}
}
