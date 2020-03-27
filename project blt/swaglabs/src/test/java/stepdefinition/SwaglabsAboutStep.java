package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SwaglabsAbout;


public class SwaglabsAboutStep {


	SwaglabsAbout about;
	
	@When("^user should login with valid credentials$")
	public void user_should_login_with_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		about.launchApplication();
		about.enterLoginDetails();
		about.clickSubmitButton();
	}
	
	@Then("^user should click the about by clicking on the home button and navigate to next page$")
	public void user_should_click_the_about_by_clicking_on_the_home_button_and_navigate_to_next_page() throws Throwable {
		about.clickAbout();
	}

	@Then("^select anyone field in the about page$")
	public void select_anyone_field_in_the_about_page() throws Throwable {
	    about.selectAnyField();
	}
	
	@Then("^close the application$")
	public void close_the_application() throws Throwable{
		about.closeApplication();
	}
	
}
