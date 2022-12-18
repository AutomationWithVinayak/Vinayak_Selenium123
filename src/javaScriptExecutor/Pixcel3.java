package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pixcel3 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_scrollby";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String frame="iframeResult";
		driver.switchTo().frame(frame);
		
		String script ="window.scrollBy(200	,0)";
		
		js.executeScript(script,"");
		
		Thread.sleep(3000);
		
		
		js.executeScript("scrollWin()","");
		
		
		
		
		
	}

}
