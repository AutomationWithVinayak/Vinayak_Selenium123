package WebTable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Task1 {                           //task incomplete table not handles
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	    WebElement Element1=driver.findElement(By.id("searchDropdownBox"));  Select s1= new Select(Element1);  s1.selectByIndex(37);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket kit"+Keys.ENTER); 
	    List<WebElement> list1=driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]//a//span"));
	    System.out.println(list1.size());
	    list1.get(9).click();
        Set<String> id=driver.getWindowHandles(); Iterator<String> it = id.iterator();
	    String id1=it.next(); System.out.println(id1);  String id2=it.next(); System.out.println(id2); System.out.println(); driver.switchTo().window(id2);
	    String text1= driver.findElement(By.xpath("//h1[@id=\"title\"]//span")).getText(); System.out.println("kit name :- "+text1);
	    
	    
	   
	}

}
