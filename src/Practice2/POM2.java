package Practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class POM2 {
	
	@FindBy(xpath="//header[@class=\"header text-center\"]//a//img") private WebElement logo;
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement button;
	
   public POM2 (WebDriver driver) {
	   
	   PageFactory.initElements(driver, this);
   }
   
   public void Logo() {
	 
	   Assert.assertTrue(logo.isDisplayed());
	   System.out.println("logo is display");
	   
   }
   
   public void PIN(String PN) {
	   pin.sendKeys(PN);
   }
   
   public void Button() {
	   button.click();
   }


}
