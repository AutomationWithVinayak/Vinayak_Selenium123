package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanalFrame6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		
//		WebElement main=driver.findElement(By.xpath("//div[@id=\"iframewrapper\"]"));
//		driver.switchTo().frame(main);
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Thread.sleep(4000);
		
	String text = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();		
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		Thread.sleep(4000);
		
		String text1=driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText();
		System.out.println(text1);
		Thread.sleep(4000);
		
	}

}
