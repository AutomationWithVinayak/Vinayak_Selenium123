package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
		
		 System.out.println("Number of Frames on a Page:" + countIframesInPage);
		 
		WebElement iframe1= driver.findElement(By.id("frame1"));
		 
		 driver.switchTo().frame(iframe1);
		 
		WebElement iframe1element = driver.findElement(By.tagName("body"));
		 
	    String iframe1text = iframe1element.getText();
	
	    System.out.println("Frame1 is :"+iframe1text);
		
	    int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
	    
	    driver.switchTo().frame(0);
	    WebElement iframe1element1 = driver.findElement(By.tagName("body")); 
		 
	    String iframe1text1 = iframe1element1.getText();
	
	    System.out.println("Frame1 is :"+iframe1text1);
	    
	    
	    
	    int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
        System.out.println("if u get 0 then no extra or more frame are availbe");
	    
	    
	    
	}
}
