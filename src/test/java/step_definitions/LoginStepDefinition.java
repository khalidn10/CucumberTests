package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	@Given("user is on landing page")
	public void user_is_on_landing_page()
	{
		System.out.println("Given user is on landing page");
	}
	
	@When("user logs into application with username {word} and password {int}")
	public void user_logs_into_application_with_username_and_password(String word1, int int1)
	{
		System.out.println("When user logs into application with username " + word1 + " and password " + int1);
	}
	
	@Then("Home page is populated")
	public void home_page_is_populated()
	{
		System.out.println("Then Home page is populated");
	}
	
	@And("payment cards {string} displayed")
	public void payment_cards_are_displayed(String string1)
	{
		System.out.println("And payment cards " + string1 + " displayed");
	}
}
