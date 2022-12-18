package practiceselenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Swati {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://app.atherenergy.com/product/450x/testride");
		driver.manage().window().maximize();
		System.out.println("Ather web applcation listbox handling without using select class");
		driver.findElement(By.xpath("//div[@class=\"ui dropdown trit-city-select-input selection\"]")).click();
		Thread.sleep(4000);
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class=\"menu transition visible\"]//div"));
		Thread.sleep(4000);
		for(int i=0;i<l1.size();i++)
		{
			String city=l1.get(i).getText();
			System.out.println(city);
			if(city.equals("Nashik"))
			{
				l1.get(i).click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@class=\"trit-date-card \" and @for=\"date-2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name=\"f_name\"])[2]")).sendKeys("Chris");
		driver.findElement(By.xpath("(//input[@name=\"l_name\"])[2]")).sendKeys("Rover");
		driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("chris123@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"contact_no\"]")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@name=\"pincode\"])[2]")).sendKeys("421410");
		
		Thread.sleep(5000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
		File dest=new File(".\\ScreenShots\\Ather"+random+".png");
		FileHandler.copy(src, dest);
		Thread.sleep(5000);
		driver.quit();
	}

}


