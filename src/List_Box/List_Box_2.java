package List_Box;
 
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import locator.Is_Select;

public class List_Box_2 { 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(5000);
		
        WebElement Day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
        WebElement Month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
        WebElement Year= driver.findElement(By.xpath("//select[@id=\"year\"]"));
        Thread.sleep(3000);
        
  /*-----_1._SelectByVisibleText(String text)_-----*/
        
//      Select selectday =new Select(Day);
//      selectday.selectByVisibleText("7");
//		Select selectmonth =new Select(Month);
//		selectmonth.selectByVisibleText("Sep");
//		Select selectyear =new Select(Year);
//		selectyear.selectByVisibleText("2015");
//		Thread.sleep(4000);
        
        
   /*-----_2._Select by index_-----*/	
        
//         Select selectday =new Select(Day);
//         selectday.selectByIndex(5);
//         Select selectmonth =new Select(Month);
//         selectmonth.selectByIndex(8);
//         Select selectyear =new Select(Year);
//         selectyear.selectByIndex(25);
		
	
    /*-----_3.selectByValue(String value)_-----*/   
         
        Select selectday =new Select(Day);
        selectday.selectByValue("6");
        Select selectmonth =new Select(Month);
        selectmonth.selectByValue("9");
        Select selectyear =new Select(Year);
        selectyear.selectByValue("1997");
         
         
         
         
         
		
	}

}
