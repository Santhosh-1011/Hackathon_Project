package StepDefinition;

import java.io.IOException;

import PageFactory.BaseclassCucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookShelves;
import pageObjects.Homepage;

public class Cucumber02 {
	BookShelves Book=new BookShelves(BaseclassCucumber.getDriver());
	@When("User should click the close popup icon")
	public void user_should_click_the_close_popup_icon() {
	    Book.close();
	}

	@When("User should click the category option in the filter")
	public void user_should_click_the_category_option_in_the_filter() {
	   Book.category();
	}

	@When("click the kids BookShelves  checkbox")
	public void click_the_kids_book_shelves_checkbox() {
	    Book.Bookshelves();
	}

	@When("User should click the price option in the filter")
	public void user_should_click_the_price_option_in_the_filter() {
	    Book.price();
	}

	@When("adjust the slider with the given details")
	public void adjust_the_slider_with_the_given_details() {
	    Book.slider();
	}

	@When("click the exclude stock checkbox")
	public void click_the_exclude_stock_checkbox() {
	    Book.stock();
	}

	@When("User should click the Recommended option in the page")
	public void user_should_click_the_recommended_option_in_the_page() {
	    Book.Recommended();
	}

	@When("select the High To Low price value")
	public void select_the_high_to_low_price_value() {
	    Book.hightolow();
	}

	@Then("Display Name and Price of the KidsBookShelves")
	public void display_name_and_price_of_the_kids_book_shelves() throws IOException {
	    Book.name();
	}

}
