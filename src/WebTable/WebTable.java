package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		

	String url= "https://demo.guru99.com/test/web-table-element.php#";
	String url2="https://www.nyse.com/ipo-center/filings";
    System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get(url);
    driver.manage().window().maximize();
	
    int row= driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody/tr")).size();
	
	System.out.println(row);
	
	int col=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//thead//th")).size();
	
	System.out.println(col);
	System.out.println();
	
	driver.navigate().to(url2);
   WebElement a=driver.findElement(By.xpath("(//th[@class=\"table-sort table-sort-desc\"])[1]"));
   
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("arguments[0].scrollIntiView;", a);
   
   int row1=driver.findElements(By.xpath("(//table[@class=\"table-data table-condensed spacer-lg table\"])[1]//tbody//tr")).size();
   System.out.println(row1);
   int col1=driver.findElements(By.xpath("(//table[@class=\"table-data table-condensed spacer-lg table\"])[1]//thead//th")).size();
   System.out.println(col1);
   
   driver.close();
	
	}
}
