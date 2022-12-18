package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		Thread.sleep(3000);
		
		String WindowID =driver.getWindowHandle();
		
		System.out.println(WindowID);  // output :- "CDwindow-BF4611349ED021D4F74FF10055171604"  its change continue  if u run again u get diff id
		
		//run again u get diff id :- "CDwindow-BF4611349ED021D4F74FF10055171604"
		
		// run again u get diff id :- "CDwindow-29B4FEC5EE41624C730FFFF40CCA7908"
	}

}
