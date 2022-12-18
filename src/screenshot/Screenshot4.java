package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot4 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
        File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		
        String random=RandomString.make(4);
        String filename ="redbus";
        
        File dest=new File("C:\\Users\\hp elitebook\\eclipse-workspace\\selenium\\ScreenShot1"+filename+random+".png");
		
		FileHandler.copy(source, dest);
		
		driver.quit();
		
	}

}
