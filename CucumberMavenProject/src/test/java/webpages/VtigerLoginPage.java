package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerLoginPage extends SeleniumUtility{
	WebDriver driver;
	public VtigerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement usernameInputField;
	
	@FindBy(css="#password")
	private WebElement passwordInputField;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement loginButton;
	
	public void loginInVtiger(String username,String pwd) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, pwd);
		clickOnElement(loginButton);
	}
	
	public void enterUsername(String username) {
		typeInput(usernameInputField, username);
	}
	public void enterPassword(String pass) {
		typeInput(usernameInputField, pass);
	}
	
	public void clickOnSigninButton() {
		clickOnElement(loginButton);
	}
}
