package frameWork;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_Without_DDf {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		ChromeOptions p=new ChromeOptions();
		p.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(p);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
        Sheet sheet =  WorkbookFactory.create(file).getSheet("Sheet3");
        String userid=sheet.getRow(0).getCell(0).getStringCellValue();
        String pass=sheet.getRow(0).getCell(1).getStringCellValue();
        String pin="141611";			
		
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(userid);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys(pin);
        driver.findElement(By.xpath("//button[text()='Continue ']")).click();
        
        String US = driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
        if(US.equals(userid)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("fail");
        }
        
        
		 
		
	
		
		
		
		
         		
	}

}
