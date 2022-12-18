package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_box_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();     // day list
		driver.findElement(By.xpath("//option[@value=\"1\"][1]")).click();    // particuler day
		 Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();            //month list
		driver.findElement(By.xpath("//option[contains(text(),'Mar')]")).click();    // particuler month
		 Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();             // year list 
		driver.findElement(By.xpath("//option[contains(text(),'2015')]")).click();   // particular year
		 Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"2\"]")).click();
		 Thread.sleep(6000);
		
		driver.close();
		
		
		
		
		
	}

}
