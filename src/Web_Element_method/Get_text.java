package Web_Element_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c://Users//hp elitebook//downloads//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		
	String text=	driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
		
	String expectedResult="Facebook helps you connect and share with the people in your life.";
	
	System.out.println("Is the text present on site :-- "+text);
	System.out.println();
	System.out.println("Expected Result :- "+expectedResult);
	System.out.println();
	System.out.println("Actual Result is  :- "+text.equals(expectedResult));
	
		
	}

}
