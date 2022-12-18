package Element_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
	
	List<WebElement> links =driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
	
	System.out.println(links.size());
	
	for(WebElement ob:links) {
		
		System.out.println(ob.getText());
	}
	
	

 }
}
