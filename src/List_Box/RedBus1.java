package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe" );  

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"src\"]")).sendKeys("Pune");
		Thread.sleep(3000);

		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		 
		for(int i=0; i<list.size(); i++) {
			String stops=list.get(i).getText();
			System.out.println(stops);
			
			if(stops.equals("Wakad, Pune")) {
				list.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id=\"dest\"]")).sendKeys("Aurangabad");
		Thread.sleep(3000);

		
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		for(int j=0; j<list2.size(); j++) {
			System.out.println(list2.get(j).getText());
			if(list2.get(j).getText().equals("CIDCO, Aurangabad"))
			{
				list2.get(j).click();
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='17']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		
		
		
		
	}
}
