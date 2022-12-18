package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ather_450X_Bike {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://app.atherenergy.com/product/450x/testride");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			
			
		System.out.println("----Click On ListBox or DropDownBox----For Get / See Total List Of City");
		System.out.println();
		
		driver.findElement(By.xpath("//div[@class=\"ui dropdown trit-city-select-input selection\"]")).click();
		Thread.sleep(2000);
		
		
		System.out.println("After Clicking Find the Path For Total City List they have 2 choice with select class and without i chose without select class");
		System.out.println("Store Multiple city in Rv Return of this is List<WebElement> by using FindElements Method ");
		System.out.println();
		
		List<WebElement> TotalCity= driver.findElements(By.xpath("//div[@class=\"menu transition visible\"]//div"));
		System.out.println("Number of TotalCity Is :- "+TotalCity.size());
		System.out.println();
		System.out.println();
		System.out.println("Name of City Is :- ");
		System.out.println("In that Atual Text Is start With Capital Letter So We Also Start City Name with Captal Letter //* Note * city is in lower case in DOM HTML Structure they Not Use");
		System.out.println();
		
		for(int i=0;  i<TotalCity.size();  i++) {
			
			System.out.println(TotalCity.get(i).getText());
			
			if(TotalCity.get(i).getText().equals("Kochi")) {
				
				TotalCity.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		List<WebElement> Totaldate= driver.findElements(By.xpath("//div[@id=\"js-tpl-date\"]//div"));
		System.out.println();
        System.out.println("Totaldate is :- "+Totaldate.size());
        System.out.println();
        System.out.println();
        System.out.println("Total Days In Text Format :- ");
		
        
            for(int j=0;  j<Totaldate.size();  j++) {
        	
        	System.out.println(Totaldate.get(j).getText());
        	
        	if(Totaldate.get(j).getText().equals("Jun 17")) {
        		
        		Totaldate.get(j).click();
        		break;
        	}
        }
           
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//input[@name=\"f_name\"])[2]")).sendKeys("Vicky");
    		driver.findElement(By.xpath("(//input[@name=\"l_name\"])[2]")).sendKeys("Vinayak");
    		driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("Vicky555.7@gmail.com");
    		driver.findElement(By.xpath("//input[@name=\"contact_no\"]")).sendKeys("7775933667");
    		driver.findElement(By.xpath("(//input[@name=\"pincode\"])[2]")).sendKeys("443302");
    		driver.findElement(By.xpath("//input[@id=\"whatsapp-consent\"]")).click();
		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
