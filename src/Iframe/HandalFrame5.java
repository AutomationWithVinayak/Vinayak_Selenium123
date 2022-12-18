//package Iframe;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class HandalFrame5 {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
//		driver.manage().window().maximize();
//		Thread.sleep(6000);
//		
//		driver.switchTo().frame("iframeResult");
//		Thread.sleep(5000);
//		driver.switchTo().frame("")
//
//		driver.findElement(By.xpath("//a[@id=\"navbtn_menu\"]")).click();
//		
//		
//		
//	}
//}
