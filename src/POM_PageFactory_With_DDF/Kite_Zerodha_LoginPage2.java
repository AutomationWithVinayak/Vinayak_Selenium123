package POM_PageFactory_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Zerodha_LoginPage2 {
	
	@FindBy(id="pin") private WebElement Pin;
    @FindBy(xpath="//button[@type=\"submit\"]") private WebElement ContinueButton;
    
    public Kite_Zerodha_LoginPage2(WebDriver driver) {
    	
    	PageFactory.initElements(driver, this);
    	
    }
    	public void EnterPin(String pin) {
    		
    		Pin.sendKeys(pin);
    		
    		
    	}
    	
    	
    	public void ClickOnContinueButton() {
    		ContinueButton.click();
    	}
    	
    }
	

