package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByelement {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/?#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement submit =driver.findElement(By.id("philadelphia-field-submit"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", submit);
		
		Thread.sleep(8000);
		
		submit.click();
		Thread.sleep(4000);
		
		String a=driver.switchTo().alert().getText();
		System.out.println(a+"  is the submite button text");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		String url2="https://www.tutorialspoint.com/index.htm";
		driver.navigate().to(url2);
		WebElement PathofElement=driver.findElement(By.xpath("//h5[contains(text(),'ABOUT US')]"));
		Thread.sleep(3000);
		
		String script = "arguments[0].scrollIntoView();";
		js.executeScript(script, PathofElement);
		Thread.sleep(3000);
		String text=PathofElement.getText();
		System.out.println(text);
		
		driver.close();
		
		
	}

}
