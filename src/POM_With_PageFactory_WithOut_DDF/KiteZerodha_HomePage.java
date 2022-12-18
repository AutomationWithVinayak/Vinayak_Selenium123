package POM_With_PageFactory_WithOut_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZerodha_HomePage {
	
	@FindBy(xpath="//span[@class=\"user-id\"]") private WebElement UserId;
	
	public KiteZerodha_HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void VerifyUserId() {
		
		String ExceptedResult = "JAJ956";
	String ActualResult=	UserId.getText();
	
	if(ActualResult.equals(ExceptedResult)) {
		
		System.out.println("pass");
		
	}
	}
	
	
	
}
