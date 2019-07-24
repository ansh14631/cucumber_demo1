package myfeatures_2pck;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Standardchartered {
	
	@Given("Anshul has done with browser configuration")
	public void anshul_has_done_with_browser_configuration() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Browser configuration done");
	}

	@Then("He lauches the application in his favourite chrome browser")
	public void he_lauches_the_application_in_his_favourite_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Launches Chrome");
	}

	@Given("He clicks on sign in link")
	public void he_clicks_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Clicked on sign in link");
	}

	@Then("He enters the valid credentials")
	public void he_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("entered valid credentials");
	}

	@Then("He clicks on Student button")
	public void he_clicks_on_Student_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Clicks on Student button");
	}

	@Given("Guest user clicks on signup link")
	public void guest_user_clicks_on_signup_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Clicks on sign up link");
	}

	@When("he provide all the manadatory details")
	public void he_provide_all_the_manadatory_details() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Provided manadatory details");
	}

	@Then("He clicks on start and id generated")
	public void he_clicks_on_start_and_id_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Clicks on start id");
	}

	@Given("he clicks on forgot password link")
	public void he_clicks_on_forgot_password_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks on forgot password");
	}

	@Then("He enters the mobile number")
	public void he_enters_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Enters mobile number");
	}

	@Then("He receives otp and the same he provided")
	public void he_receives_otp_and_the_same_he_provided() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Receives otp");
	}
	
	

}
