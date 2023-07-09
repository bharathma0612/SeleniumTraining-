package flipkart;


import org.openqa.selenium.WebElement;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojoClass.PojoFlipkart;

public class Flipkart extends BaseClass {
	
	PojoFlipkart f;
	@Given("To launch chrome Browser and maxi")
	public void to_launch_chrome_Browser_and_maxi() {
	   launchBrowser("chrome");
	   maxi();
	}

	@When("To launch Flipkart Url")
	public void to_launch_Flipkart_Url() {
	  launchUrl("https://www.flipkart.com/");
	}
	

	@When("To enter email or mobile number")
	public void to_enter_email_or_mobile_number() throws InterruptedException {
		
	    f= new PojoFlipkart();
		passText("bharathma0612@gmail.com", f.getEmail());
	    
	}

	@When("To click Request OTP")
	public void to_click_Request_OTP() throws InterruptedException {
		
		 f= new PojoFlipkart();
		WebElement otpButton = f.getOtpButton();
		click(otpButton);
	   
	}

	@Then("Close browser")
	public void close_browser() {
	   closeBrowser();
	}

}
