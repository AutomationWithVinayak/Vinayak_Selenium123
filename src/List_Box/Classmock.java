package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classmock {
	
	
		

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("http://demo.automationtesting.in/Register.html");
			driver.get("http://demo.automationtesting.in/Register.html");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
			
			String a="//ul[@class=\"dropdown-menu\"]//li";
			List<WebElement> list=driver.findElements(By.xpath(a));
			for(int i=0; i<list.size(); i++) {
				
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().equals("Frames")) {
					list.get(i).click();
				}
			}
			
			Thread.sleep(6000);
			driver.navigate().to("http://demo.automationtesting.in/Frames.html");
			Thread.sleep(4000);
			
			WebElement single=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
			driver.switchTo().frame(single);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Vicky");
			Thread.sleep(5000);
			
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
			
			WebElement father = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
			driver.switchTo().frame(father);
			Thread.sleep(3000);
			
			WebElement child =driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
			driver.switchTo().frame(child);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Vinayak");
			

	}

}
