package StepDefinition;

import java.io.IOException;

import PageFactory.BaseclassCucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookShelves;
import pageObjects.Homepage;


public class Cucumber01 {
	Homepage home=new Homepage(BaseclassCucumber.getDriver());
	@Given("User should enter BookShelves in the searchbox")
	public void user_should_enter_book_shelves_in_the_searchbox() throws IOException {
	    home.search();
	}

	@When("click the searchicon")
	public void click_the_searchicon() {
	    home.button();
	}

}