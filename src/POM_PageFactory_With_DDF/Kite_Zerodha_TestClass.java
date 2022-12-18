package POM_PageFactory_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Kite_Zerodha_TestClass {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		ChromeOptions p = new ChromeOptions();
		p.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(p);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet3");
		String userid=sheet.getRow(0).getCell(0).getStringCellValue();
		String pass = sheet.getRow(0).getCell(1).getStringCellValue();
		String pin = sheet.getRow(0).getCell(2).getStringCellValue();
		
		
		Kite_Zerodha_LoginPage1 page1= new Kite_Zerodha_LoginPage1(driver);
		
		page1.EnterUserId(userid);
		page1.EnterPassword(pass);
		page1.ClickOnLoginButton();
		
		
		Kite_Zerodha_LoginPage2 page2=new Kite_Zerodha_LoginPage2(driver);
		page2.EnterPin(pin);
		page2.ClickOnContinueButton();
		
		
		Kite_Zerodha_HomePage page3 = new Kite_Zerodha_HomePage(driver);
		page3.VerifyUserId(userid);
		
		
		
		//driver.quit();
		
	}

}
