package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Select {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/hp%20elitebook/Desktop/%C2%A0/Ranjeet%20Sir%20automation/HTML/LoginFormComplete2.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
//		boolean pnt1 =driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected();
//		
//		System.out.println(pnt1);
	
	driver.findElement(By.xpath("//input[@id=\"Male\"]")).click();
		
	boolean pnt2 =driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected();
	System.out.println(pnt2);

	
	if(pnt2==true) {
		System.out.println("is selected");
	}
	else {
		System.out.println("is not selected");
	}
	
	
	
	driver.close();
	
	
	
	
		
	}

}
