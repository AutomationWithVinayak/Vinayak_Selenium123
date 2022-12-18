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

public class ScreenShoot8 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	WebElement Screen1 =	driver.findElement(By.xpath("//img[@class=\"s4Iyt\"]"));
		
	String random=RandomString.make(4);
	String filename="logo";
	
	File source=((TakesScreenshot)Screen1).getScreenshotAs(OutputType.FILE);
	
	File dest = new File(".\\"+filename+random+".png");
	
	FileHandler.copy(source, dest);
	
	}

}
