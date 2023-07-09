package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;

public class ICICpojoClass extends BaseClass {
	
	public ICICpojoClass() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//a[@id='login-btn']")
	private WebElement loginButton;
	@FindBy(xpath="//input[@id='DUMMY1']")
	private WebElement userID1;
	@FindBy(xpath="//input[@id='AuthenticationFG.USER_PRINCIPAL']")
	private WebElement userID2;
	@FindBy(xpath="//input[@id='AuthenticationFG.ACCESS_CODE']")
	private WebElement pass;
	@FindBy(xpath="//input[@id='VALIDATE_CREDENTIALS1']")
	private WebElement submit;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getUserID1() {
		return userID1;
	}
	public WebElement getUserID2() {
		return userID2;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	

}
