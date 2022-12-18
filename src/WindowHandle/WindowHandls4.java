package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandls4 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> WID=driver.getWindowHandles();
		
		Iterator<String> it = WID.iterator();
		String firstPage =it.next();
		String SecondPage=it.next();
		System.out.println("1st Id:- "+firstPage);
		System.out.println("2nd Id:- "+SecondPage);
		
		System.out.println();
		
		ArrayList<String> a= new ArrayList<String>(WID);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		driver.quit();
		
		
		
		
		
		
	
	}

}
