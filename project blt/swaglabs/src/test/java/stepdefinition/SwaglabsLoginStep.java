package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SwaglabsLogin;

public class SwaglabsLoginStep {
	
	SwaglabsLogin logIn;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		logIn.launchApplication();
	}

	@When("^User enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enter_valid_username_and_valid_password(String userName, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		logIn.enterLoginDetails(userName, password);
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		logIn.clickSubmitButton();
	}

	@Then("^close the application$")
	public void close_the_application() throws Throwable{
		logIn.closeApplication();
	}
	
}
