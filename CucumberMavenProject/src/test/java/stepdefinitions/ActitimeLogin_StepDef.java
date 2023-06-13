package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.SeleniumUtility;
import webpages.ActitimeLoginPage;

public class ActitimeLogin_StepDef extends SeleniumUtility{
	
	ActitimeLoginPage getActitimeLoginPage;

	@Given("^user in on actitime login page$")
    public void user_in_on_actitime_login_page() {
        WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
        getActitimeLoginPage=new ActitimeLoginPage(driver);
    }

    @When("^user enters username as (.+) in the username field$")
    public void user_enters_username_as_in_the_username_field(String username) {
    	getActitimeLoginPage.enterUsername(username);
    }

    @Then("^user should get page title as (.+)$")
    public void user_should_get_page_title_as(String title) {
    	String actutalTitle=getCurrentTitleOfApplication(title);
    	Assert.assertEquals(actutalTitle, title);
    }

    @And("^user enters password as (.+) in password field$")
    public void user_enters_password_as_in_password_field(String password) {
    	getActitimeLoginPage.enterPassword(password);
    }

    @And("^clicks on Login button$")
    public void clicks_on_login_button() {
        getActitimeLoginPage.clickOnLoginButton();
    }
}
