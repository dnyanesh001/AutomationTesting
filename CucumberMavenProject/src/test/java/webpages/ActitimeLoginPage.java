package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeLoginPage extends SeleniumUtility {
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement usernameInputField;
	@FindBy(name = "pwd")
	private WebElement passwordInputField;
	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public void enterUsername(String name) {
		typeInput(usernameInputField, name);
	}

	public void enterPassword(String pwd) {
		typeInput(passwordInputField, pwd);
	}

	public void clickOnLoginButton() {
		clickOnElement(loginButton);
	}
}
