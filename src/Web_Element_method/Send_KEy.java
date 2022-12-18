package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_KEy {

	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
       WebDriver driver =new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
    WebElement  value =driver.findElement(By.xpath("//input[@id=\"email\"]"));   
    Thread.sleep(3000);
    value.sendKeys("Vinayak");
    
    Thread.sleep(4000);
    driver.close();
}
}
