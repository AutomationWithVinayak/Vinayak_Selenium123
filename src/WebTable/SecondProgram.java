package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProgram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.w3schools.com/html/html_tables.asp");
	      driver.manage().window().maximize();
	      
	    int row= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size(); 
		System.out.println("row :- "+row);
		int col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("col :- "+col);
		
		//fetch perticuler row / col data
		
		String row2col3=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td[3]")).getText();
		System.out.println(row2col3+"  value from Row2/Col3 :=G");
		
		String row3col2=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td[2]")).getText();
		System.out.println(row3col2+"  value from Row3/Col2 :=F");
		
		String row7col1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[7]/td[1]")).getText();
		System.out.println(row7col1+"  value from Row7/Col1 :=M");
		
		String row4col2=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[2]")).getText();
		System.out.println(row4col2+"  value from Row4/Col2 :=R");
		
		
	}
}
