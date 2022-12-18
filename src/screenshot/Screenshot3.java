package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(4);              // random name of file automatic 
		String Filename="Facebook";
		
		File dest = new File("C:\\Users\\hp elitebook\\Desktop\\ScreenShoot\\"+Filename+Random+".jpg");
		
		FileHandler.copy(source, dest);
		
		driver.quit();
		
		
	}

	
}
