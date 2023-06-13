package actitimePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActiTimeLoginPage extends SeleniumUtility {

	public ActiTimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(name = "pwd")
	private WebElement passwordField;

	@FindBy(id = "loginButton")
	private WebElement LoginButton;

	public void loginOperation(String username, String password) {
		typeInput(usernameField, username);
		typeInput(passwordField, password);
		performClick(LoginButton);

	}

}
