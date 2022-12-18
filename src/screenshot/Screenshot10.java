package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot10 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'; border='10px solid red;'", email);
		email.sendKeys("Vinayak");
		
		String random=RandomString.make(4);
		String filename="Email_Input";
		
		File source=((TakesScreenshot)email).getScreenshotAs(OutputType.FILE);

		File dest = new File(".\\"+filename+random+".png");
		
		FileHandler.copy(source, dest);

		
		
		
	
		
		
		
		
         
		
		
		
		
		
        
		driver.quit();
		
		
		
		
		
		
		
	}

}
