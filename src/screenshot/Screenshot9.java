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

public class Screenshot9 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[2]/div/p"));
		
		String b = RandomString.make(4);
		String c ="Insta";
		
	File source= ((TakesScreenshot)a).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\hp elitebook\\eclipse-workspace\\selenium\\ScreenShot1"+c+b+".png");
		
	FileHandler.copy(source, dest);
	
	}
     
}
