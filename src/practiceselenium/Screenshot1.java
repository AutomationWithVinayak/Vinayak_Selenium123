package practiceselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver" , "c://Users//hp elitebook//downloads//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\hp elitebook\\Desktop\\ScreenShoot\\image3.jpg");
		
		FileHandler.copy(source, dest);
		
	}

}
