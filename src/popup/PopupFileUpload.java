package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupFileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).sendKeys("C:\\Users\\hp elitebook\\Desktop\\Autoit\\New Text Document.txt");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
		
		String a= driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		
		System.out.println(a);
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
		
		
	}

}
