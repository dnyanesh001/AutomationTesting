package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class GoogleSearch_StepDef extends SeleniumUtility{

// when you have hardcoded data in feature file	

//	WebDriver driver;
//	@Given("User has already on google search page")
//	public void user_has_already_on_google_search_page() {
//	    driver=setUp("chrome", "https://www.google.com");
//	   
//	}
//
//	@When("user types {string} in search input field and press enter key")
//	public void user_types_in_search_input_field_and_press_enter_key(String string) {
//	    typeInput(driver.findElement(By.name("q")), string);
//	    getActiveElementFromUi().sendKeys(Keys.ENTER);
//	   
//	}
//	@Then("User should able to get result page with title having {string}")
//	public void user_should_able_to_get_result_page_with_title_having(String string) {
//	    String actualTitle=getCurrentTitleOfApplication();
//	    Assert.assertTrue(actualTitle.contains(string));
//	}
}
