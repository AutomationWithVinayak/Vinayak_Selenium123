package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolut_path {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	  driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("BhotHard");
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/form/div/div/input")).clear();
		
	}

}
