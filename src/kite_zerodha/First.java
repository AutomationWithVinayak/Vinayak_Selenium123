package kite_zerodha;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class First {
	
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
		String a= sheet.getRow(0).getCell(2).getStringCellValue();
				
		JavascriptExecutor f= (JavascriptExecutor) driver;
		
		
		driver.findElement(By.id("userid")).sendKeys(usern);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(a);
		//f.executeScript("arguments[0].value='141611';", pass);
	  //  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/div/input")).sendKeys("141611"); 
		driver.findElement(By.xpath("//button[@class=\"button-orange wide\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search eg: infy bse, nifty fut, nifty weekly, gold mcx\"]")).sendKeys("TCS");
		driver.findElement(By.xpath("//ul[@class=\"omnisearch-results\"]//div/li[1]")).click();
		Thread.sleep(3000);
		WebElement radio1=driver.findElement(By.xpath("//div[@class=\"exchange-selector\"]//div/div//input"));
		f.executeScript("arguments[0].click()", radio1);
		WebElement input1=driver.findElement(By.xpath("(//div[@class=\"no su-input-group su-static-label\"]//input)[1]"));
		f.executeScript("arguments[0].value='5';", input1);
		Thread.sleep(3000);
		WebElement radio2=driver.findElement(By.xpath("//div[@data-balloon=\"Buy at market price\"]//input"));
        f.executeScript("arguments[0].click()", radio2);
		
		
	 
	}

}
