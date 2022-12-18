package practiceselenium;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List101 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Vinayak");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Vicky");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("vinayak@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("7775593366");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();	
		Thread.sleep(4000);
		
		
		
		
		
//		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
//	List<WebElement> lang = driver.findElements(By.xpath("//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]//li//a"));
//		
//	
//	
//	System.out.println(lang.size());
//	
//	for(int i=0; i<lang.size(); i++) {
//		
//		System.out.println(lang.get(i).getText());
//		
//		if(lang.get(i).getText().equals("Hindi")) {
//		lang.get(i).click();
//		
//		}
//	}
//		
		
	    
		Thread.sleep(2000);
	    
		WebElement s1= driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		
		Select s=new Select(s1);
		s.selectByVisibleText("Android");
		Thread.sleep(3000);

		
		
		WebElement Country = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		country1(Country,"India");
		
		
		
		
		Thread.sleep(3000);
		
		WebElement year =driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		WebElement month =driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		WebElement day =driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		
		String date="1940-February-6";
		String [] dob=date.split("-");
		
		DOB(year,dob[0]);
		DOB(month,dob[1]);
		DOB(day,dob[2]);
		
		driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("Vicky");
	    driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("Vicky");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\hp elitebook\\Desktop\\vk.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
		
}
	public static void DOB(WebElement element , String value) {
		
		Select s3= new Select (element);
		s3.selectByVisibleText(value);
		
	}
	public static void country1(WebElement element1 , String value1) {
		
		Select s4 = new Select (element1);
		s4.selectByValue(value1);
		
	}
	
}