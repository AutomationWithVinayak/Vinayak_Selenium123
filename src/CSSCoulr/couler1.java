package CSSCoulr;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class couler1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://installer//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
		
		String btncolor=button.getCssValue("background-color");
		
		String Actualcolor = Color.fromString(btncolor).asHex();
		String Exceptedcolor="#1877f2";
		
		Assert.assertEquals(Exceptedcolor, Actualcolor);
		System.out.println("is right color");
		
		driver.quit();
         
              
              
		
	}
}
