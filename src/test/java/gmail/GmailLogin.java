package gmail;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojoClass.gmailPojoClass;

public class GmailLogin extends BaseClass {
	
	gmailPojoClass g;
	@Given("User had to launch the brower and maximize chrome browser")
	public void user_had_to_launch_the_brower_and_maximize_chrome_browser() {
		launchBrowser("chrome");
		maxi();
	   
	}

	@When("User had to Launch the gmail application in chrome browser")
	public void user_had_to_Launch_the_gmail_application_in_chrome_browser() {
		launchUrl("https://mail.google.com/");
	    
	}

	@When("User has to pass the data{string} in email Field")
	public void user_has_to_pass_the_data_in_email_Field(String em) {
	    
		g=new gmailPojoClass();
		passText(em, g.getEmail());
		
		
	}
	
	@When("User has to click next")
	public void user_has_to_click_next() {
		 g=new gmailPojoClass();
		 click(g.getNextButton());
	}

	@When("User has to pass the data{string} in passowrd field")
	public void user_has_to_pass_the_data_in_passowrd_field(String pass) {
	    System.out.println(pass);
		/*g=new gmailPojoClass();
		passText(pass, g.getPassword());*/
	}

	@When("User had to click button login")
	public void user_had_to_click_button_login() {
		 /*g=new gmailPojoClass();
		 click(g.getNextButton());*/
	    
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	   closeBrowser();
	}

}
