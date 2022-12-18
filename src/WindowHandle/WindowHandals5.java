package WindowHandle;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandals5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		Iterator<String> it=id.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		System.out.println("parent Window id :- "+parent);
		System.out.println("child window id :- "+child);
		System.out.println();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		String title1=driver.getTitle();
		System.out.println("parent window title:- "+title1);
		System.out.println("url of parent window:- "+driver.getCurrentUrl());
		System.out.println();
		Thread.sleep(3000);
		
		driver.switchTo().window(child);
		String title2=driver.getTitle();
		System.out.println("child window title :- "+title2);
		System.out.println("url of child window:- "+driver.getCurrentUrl());
		System.out.println();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contact Sales')]")).click();
		driver.findElement(By.id("Form_submitForm_FullName")).sendKeys("vinayak");
		driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("CGM");
		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("QA");
		Thread.sleep(2000);
		
	   WebElement number=driver.findElement(By.xpath("//select[@id=\"Form_submitForm_NoOfEmployees\"]")); 
	   Select s1= new Select(number);
	   s1.selectByValue("101 - 150");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//div[@class=\"iti__selected-flag\"]")).click();
	   
       List<WebElement> country = driver.findElements(By.xpath("//ul[@id=\"iti-0__country-listbox\"]//li//span"));  
	 
	   System.out.println(country.size());
	   
	   for(int i=0; i<country.size(); i++) {
		   
		   System.out.println(country.get(i).getText());
		   
		   if(country.get(i).getText().equals("India")) {
			   country.get(i).click();
			   break;
			   
		   }
	   }
	   
	   driver.findElement(By.xpath("//input[@id=\"Form_submitForm_Contact\"]")).sendKeys("7775933667");
	   driver.findElement(By.id("Form_submitForm_Email")).sendKeys("vickyb557.7@gmail.com");
	   Thread.sleep(1000);
	   
	   driver.findElement(By.id("Form_submitForm_Comment")).sendKeys("practice on this site");
	   Thread.sleep(2000);
	   
          driver.switchTo().window(parent);
          Thread.sleep(2000);
          
          driver.findElement(By.name("txtUsername")).sendKeys("admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin");            ////input[@id="txtPassword"]
	     driver.findElement(By.id("btnLogin")).click();
	     
	     String text=driver.findElement(By.xpath("//span[@id=\"spanMessage\"]")).getText();
		 System.out.println();
	     System.out.println("if u entire wrong username or pass show error massege :- "+text);
	     
	     driver.navigate().refresh();
	     
	     driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");            ////input[@id="txtPassword"]
	     driver.findElement(By.id("btnLogin")).click();
	     
	   String text2 =  driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	   System.out.println("if u entre right username and pass it will go on dashbord page :- "+text2);
	   
	   driver.switchTo().window(child);
	   driver.close();
	   Thread.sleep(5000);
	   driver.quit();
	   System.out.println();
	   System.out.println("close tab using close(); method and quit(); method");
	   
	   
	   
	     
	 	}

}
