package POM_PageFactory_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Zerodha_LoginPage1 {
	
	@FindBy(id="userid") private WebElement UseId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement LoginButton;
	
	
	Kite_Zerodha_LoginPage1(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId(String userid) {
		
		UseId.sendKeys(userid);
	}

	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void ClickOnLoginButton() {
		LoginButton.click();
	}
}
