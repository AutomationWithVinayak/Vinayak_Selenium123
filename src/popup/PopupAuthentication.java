package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAuthentication {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		//https://username:password@the-internet.herokuapp.com/basic_auth
		// above steps are use to handle authentication popup int that we pass username and password in start of url
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
		String a=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).getText();
		
		System.out.println(a);
		
	
		driver.quit();
		
//		Alert text = driver.switchTo().alert();
//		System.out.println(text);
		
	}

}
