package pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;





public class pojoAmazon extends BaseClass{
	
	public pojoAmazon() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement Hellosignin;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submit;

	public WebElement getHellosignin() {
		return Hellosignin;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	

}
