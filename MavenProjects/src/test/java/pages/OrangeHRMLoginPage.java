package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRMLoginPage extends SeleniumUtility{
	public OrangeHRMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//UserName
	@FindBy(name = "username")
	private WebElement usernameInput;
	@FindBy(name="password")
	private WebElement passwordInputField;
	@FindBy(tagName = "button")
	private WebElement loginButton;
	public void LoginInOrangeHRM(String username,String password) {
		typeInput(usernameInput, username);
		typeInput(passwordInputField, password);
		performClick(loginButton);
	}
	public String OrangeHRMLoginTitle() {
		return getCurrentTitleOfApplication();
	}
}
