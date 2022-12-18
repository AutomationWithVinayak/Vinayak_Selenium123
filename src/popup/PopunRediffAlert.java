package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopunRediffAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("123");
	
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	Thread.sleep(5000);
	
	
         Alert text=	driver.switchTo().alert();
         
         String gettext = text.getText();
         
	System.out.println(gettext);
	
	if(gettext.equals("Please enter your password")) {
		System.out.println("Correct alert message");
		
	}
		
		else 
			System.out.println("InCorrect alert message");
	
	text.accept();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
		
	}
	
	
	
	
	
	}	


