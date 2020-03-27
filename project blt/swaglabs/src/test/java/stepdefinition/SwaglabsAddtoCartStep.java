package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SwaglabsAddtoCart;


public class SwaglabsAddtoCartStep {

	SwaglabsAddtoCart cart;
	
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		cart.launchApplication();
	}
	
	@When("^user should login with valid credentials$")
	public void user_should_login_with_valid_credentials() throws Throwable {
		cart.enterLoginDetails();
		cart.clickSubmitButton();
	}

	@Then("^user should be able to add the product to the cart$")
	public void user_should_be_able_to_add_the_product_to_the_cart() throws Throwable {
		cart.addToCart();
	}
	
	@Then("^close the application$")
	public void close_the_application() throws Throwable{
		cart.closeApplication();
	}
	
}
