package StepDefinition;

import java.io.IOException;

import PageFactory.BaseclassCucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookShelves;
import pageObjects.GiftCards;

public class Cucumber03 {
	GiftCards Gift=new GiftCards(BaseclassCucumber.getDriver());
	@When("user should click the living option in the page")
	public void user_should_click_the_living_option_in_the_page() {
	   Gift.living();
	}

	@Then("Display values under the Living storage")
	public void display_values_under_the_living_storage() throws IOException {
	    Gift.livingstorage();
	}

	@When("User should click the giftcards in the given page")
	public void user_should_click_the_giftcards_in_the_given_page() {
	    Gift.giftcards();
	}

	@When("user should click the Birthday\\/Anniversary option in the given page")
	public void user_should_click_the_birthday_anniversary_option_in_the_given_page() {
	    Gift.scroll();
	    Gift.Birthdayoranniversary();
	}

	@When("Enter the details under giftcard")
	public void enter_the_details_under_giftcard() {
	    Gift.amount();
	    Gift.month();
	    Gift.date();
	}

	@When("User should click the next button")
	public void user_should_click_the_next_button() {
	    Gift.next();
	}

	@When("user should enter the details")
	public void user_should_enter_the_details() throws IOException, InterruptedException {
	    Gift.details();
	}

	@Then("validate the warning message in the To checkbox")
	public void validate_the_warning_message_in_the_to_checkbox() throws InterruptedException, IOException {
	    Gift.warning_msg();
	    Gift.valid_details();
	}

	@Then("validate the warning message in the From checkbox")
	public void validate_the_warning_message_in_the_from_checkbox() throws IOException {
	    Gift.warning_msg2();
	}

	@Then("click the confirm button")
	public void click_the_confirm_button() throws InterruptedException, IOException {
	     Gift.valid_details2();
	}
	
}


