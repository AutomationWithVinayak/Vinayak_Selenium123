package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

@SuppressWarnings("deprecation")
public class Opera {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", "C://installer//operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
