package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot7 {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		takescreenshot("loginpage");
		driver.quit();
	}
	public static void takescreenshot(String Filename) throws IOException {
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String random= RandomString.make(4);

		File dest=new File(".\\"+Filename+random+".png");
		
		FileHandler.copy(source, dest);
		
		
	}

}
