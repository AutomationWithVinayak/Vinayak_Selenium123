package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot5 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Screen=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		
		String random=RandomString.make(4);
		String filename="logo";
		
	      
		
      File source=  ((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);	
      
      File dest =new File("C:\\Users\\hp elitebook\\eclipse-workspace\\selenium\\ScreenShot1"+random+filename+".png");
      
      
      FileHandler.copy(source, dest);
      
      
        
      
      
      
      
      
      
      
      
      
      
      
    driver.quit();
		
	}

}
