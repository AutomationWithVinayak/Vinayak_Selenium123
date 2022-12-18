package kite_zerodha;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class b {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(p);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet3");
		String usern=sheet.getRow(0).getCell(0).getStringCellValue();
		String pass=sheet.getRow(0).getCell(1).getStringCellValue();
		FileInputStream file1 = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
		Sheet pin0 =WorkbookFactory.create(file1).getSheet("Sheet3");
		String ppp=pin0.getRow(0).getCell(2).getStringCellValue();
        
		
		
		driver.findElement(By.id("userid")).sendKeys(usern);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(ppp);

		
		
		
		
	   // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/div/input")).sendKeys("141611"); 
		driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
		
		driver.findElement(By.xpath("(//button[@class=\"button-blue\"])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"button-outline\"]")).click();
		
		
//		Actions action = new Actions(driver);
//		
//		WebElement viki=driver.findElement(By.xpath(""));
//	    action.moveToElement(viki);
		
		
	
		
		
//		driver.findElement(By.xpath("(//div[@class=\"vddl-draggable instrument up index6\"]//div//span//button)[1]")).click();
//		
//		Actions a = new Actions(driver);
//	     WebElement b=driver.findElement(By.xpath("(//span[@class=\"symbol\"])[7]"));
//		f.executeScript("arguments[0].click()", b);
//		a.moveToElement(b);
//		
		

}
}
