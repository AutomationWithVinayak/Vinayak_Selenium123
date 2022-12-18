package List_Box;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTry {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		System.out.println("Redbus applcation listbox handling without using select class");
		
		System.out.println("*SOURCE*");
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Mumbai");
		Thread.sleep(1000);
		
		List<WebElement> l1=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(int i=0;i<l1.size();i++) {
			String src=l1.get(i).getText();
			System.out.println(src);
			if(src.equals("Goregaon East, Mumbai")) {
				l1.get(i).click();
				break;
			}
		}
		System.out.println("*DESTINATION*");
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Nashik");
		Thread.sleep(1000);
		
		List<WebElement> l2=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(WebElement w1:l2) {
			System.out.println(w1.getText());
			if(w1.getText().equals("Bytco Point, Nashik")) {
				w1.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		driver.findElement(By.xpath("//td[text()='9']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"search_btn\" and text()='Search Buses']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}


