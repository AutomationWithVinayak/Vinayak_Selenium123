//package synchronization;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//java.lang.Object;
//import org.openqa.selenium.ui.FluentWait<T>;
//
//public class FluentWait {
//	
//	
//	 public static void main(String[] args) {
//
//		 
//
//         // configure chromedriver
//
//         System.setProperty("webdriver.chrome.driver", "F:\\My_Programs\\Selenium\\ChromeDriver\\chromedriver.exe");
//
//
//
//         WebDriver driver = new ChromeDriver();
//
//        
//
//         Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//
//                         .withTimeout(Duration.ofSeconds(15))
//
//                         .pollingEvery(Duration.ofSeconds(2))
//
//                         .ignoring(Exception.class);
//
//
//
//         // Launch website
//
//         driver.get("https://www.registration.tools4testing.com/");
//
//        
//
//         // Click on the Login Button
//
//         driver.findElement(By.id("loginopener")).click();
//
//
//
//         // Focus on the dialog window by click on dialog window title
//
//         WebElement loginWindow;
//
//         loginWindow= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-1\"]")));
//
//         loginWindow.click();
//
//        
//
//         // Enter user name
//
//         driver.findElement(By.id("loginUsername")).sendKeys("manu.m@tools4testing.com");
//
//        
//
//         // Enter user password
//
//         driver.findElement(By.id("loginPassword")).sendKeys("hello");
//
//        
//
//         // Click on the Login Button
//
//         driver.findElement(By.id("loginButton")).click();
//
//        
//
//         WebElement loginSuccessWindow;
//
//         loginSuccessWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-3\"]")));
//
//         loginSuccessWindow.click();
//
//        
//
//         driver.findElement(By.xpath("//*[@id=\"loginSuccessDialog\"]/div/span/input")).click();
//
//        
//
//         //close the driver
//
//         driver.quit();
//
//        
//
// }
//	
//	
//	
//
//}
