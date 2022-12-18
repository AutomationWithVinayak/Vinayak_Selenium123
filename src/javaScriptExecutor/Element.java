package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url1="http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html";
		String url2="https://www.freesites.com.au/";
		String path1 ="//h2[contains(text(),'2 axis scrollbars positioned outside')]";
		String path2="(//a[text()='Try the demo'])[2]";
		String script1 ="arguments[0].scrollIntoView();";
		String script2= "arguments[0].scrollIntoView();";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url1);
		driver.manage().window().maximize();
		WebElement p1=driver.findElement(By.xpath(path1));
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script1,p1 );
	    String t1=p1.getText();
		System.out.println(t1+"  is the element text");
		
		Thread.sleep(3000);
		driver.navigate().to(url2);
		WebElement p2=driver.findElement(By.xpath(path2));
		js.executeScript(script2, p2);
		System.out.println(p2.getText()+"  is the BottonText");
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
