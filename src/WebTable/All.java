package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
          WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
         JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement Text = driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		js.executeScript("arguments[0].scrollIntoView();", Text);
		
		
		// How many rows are there in table
		
		// First way
	    int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		
	    System.out.println("Total No of rows are :"+row);
	 
	 // Second Way
	
	   List<WebElement> Row1 = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
	    System.out.println("Total No of rows are :"+Row1.size());
	
	// How many col in the table
	
	    int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();	
	    System.out.println("Total No of col are :"+col);
	
	  List<WebElement> col1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
	  System.out.println("Total No of rows are :"+col1.size());
	  
	  
	  // Retrive the specific row/column data
	  String value = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[3]")).getText();
	  System.out.println(value);
	  
	  String value1 = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[5]/td[3]")).getText();
	  System.out.println(value);
	  
	  // Retive all the data from table
	  //Outer loop
	  for(int i=2;i<=row;i++) {  //2
		  // i
	  for(int j=1;j<=col;j++) {  //1
			 
			  String data = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText()+" | ";
			  //we can not pass the variable in side the xpath
			  System.out.print(data);
		  }
		  System.out.println();

       }
		
		
		
		
	}
}
