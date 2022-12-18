package POM_PageFactory_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Zerodha_HomePage {
	
	
	@FindBy(xpath="//span[@class=\"user-id\"]") private WebElement UserId;
	
	public Kite_Zerodha_HomePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	public void VerifyUserId(String ExpectedUserid) {
		
		String ActualUserid =UserId.getText();
		
		if(ExpectedUserid.equals(ActualUserid)) {
			
			System.out.println("Correct UserId");
		}
		else 
		{
			System.out.println("Incorrect UserId");
		}
		
	}
	
	
	

}
