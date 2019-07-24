package myfeatures_3pck;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testme {
	@Given("I am launching the test me application")
	public void i_am_launching_the_test_me_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Launching");
		
	}

	@Given("I click on signin link")
	public void i_click_on_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Sigin button clicked");
	}

	@When("I provide Username{string}")
	public void i_provide_Username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("username this time is " +string);
	}

	@When("I provide password{string}")
	public void i_provide_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("password this time is " +string);
	}

	@Then("I click on login and verify the login status")
	public void i_click_on_login_and_verify_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Clicked on login");
	}
	

}
