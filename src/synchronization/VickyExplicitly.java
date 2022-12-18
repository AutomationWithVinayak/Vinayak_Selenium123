package synchronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VickyExplicitly {   //WebDriverWait ExpectedConditions
	 
	public static void main(String[] args) throws InterruptedException {
		String url="https://www.registration.tools4testing.com/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp elitebook\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));

            // Launch website
            driver.get(url);
            
            // Click on the Login Button
            driver.findElement(By.id("loginopener")).click();

            // Focus on the dialog window by click on dialog window title
            WebElement  loginWindow= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-1\"]"))); //viki//span[@id="ui-id-1"]
            loginWindow.click();

            // Enter user name
            driver.findElement(By.id("loginUsername")).sendKeys("manu.m@tools4testing.com");

            // Enter user password
            driver.findElement(By.id("loginPassword")).sendKeys("hello");

            // Click on the Login Button
             driver.findElement(By.id("loginButton")).click();

           WebElement loginSuccessWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-3\"]")));  //viki////span[@id="ui-id-3"]
            loginSuccessWindow.click();
            driver.findElement(By.xpath("//*[@id=\"loginSuccessDialog\"]/div/span/input")).click();  //viki//input[@class="continue-login-button"]

            //close the driver

            //driver.quit();

           

    }

}