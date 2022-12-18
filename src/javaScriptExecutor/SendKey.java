package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

      public class SendKey {
     	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
   //send data without using sendkey
  
		//driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		
		
		
		
		
		
		
		
		


      //   js.executeScript("document.getElementById('some id').value='someValue';");
     //    js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");
	}

}
