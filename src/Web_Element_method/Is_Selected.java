package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("file:///C:/Users/hp%20elitebook/Desktop/%C2%A0/Ranjeet%20Sir%20automation/HTML/LoginFormComplete2.html");
		driver.manage().window().maximize();
		
		boolean radio = driver.findElement(By.xpath("//input[@id=\"Male\"]")).isSelected();
		System.out.println(radio);
		
		if(radio==true) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio botton is not selected");
		}
		
	    
	    
		
	}
}
