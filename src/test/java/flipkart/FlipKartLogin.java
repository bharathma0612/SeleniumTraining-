package flipkart;

import java.util.List;
import java.util.Map;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pojoClass.PojoFlipkart;

public class FlipKartLogin extends BaseClass {
	
	PojoFlipkart p;
	@Given("User has to launch the chrome browser and maximize")
	public void user_has_to_launch_the_chrome_browser_and_maximize() {
	   launchBrowser("chrome");
	   maxi();
	}

	@When("User has to navigate to the Flipkart Webpage in browser")
	public void user_has_to_navigate_to_the_Flipkart_Webpage_in_browser() {
	   launchUrl("https://www.flipkart.com/");
	}

	@When("user has to give email or mobile no in username field")
	public void user_has_to_give_email_or_mobile_no_in_username_field(DataTable e) {
     p= new PojoFlipkart();
     List<Map<String, String>> m = e.asMaps();
     passText(m.get(1).get("mobile"), p.getEmail());
	}

	@When("user has to click send otp")
	public void user_has_to_click_send_otp() {
		p= new PojoFlipkart();
		click(p.getOtpButton());
	    
	}

	@Then("Close the chrome browser")
	public void close_the_chrome_browser() {
	    closeBrowser();
	}

}
