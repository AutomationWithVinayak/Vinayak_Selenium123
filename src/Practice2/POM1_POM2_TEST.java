package Practice2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class POM1_POM2_TEST {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		FileInputStream file= new FileInputStream("C:\\Users\\hp elitebook\\Desktop\\TestData\\Login.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet3");
		String user=sheet.getRow(0).getCell(0).getStringCellValue();
		String ps=sheet.getRow(0).getCell(1).getStringCellValue();

		POM1 t = new POM1(driver);
		t.Logo();
		t.enter_userid(user);
		t.enter_pass(ps);
		t.ClickContinueButton();
		
		
	}
	

}
