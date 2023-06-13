package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHrmCreatePim extends SeleniumUtility{
	public OrangeHrmCreatePim(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "firstName")
	private WebElement firstnameInputField;
	@FindBy(name="middleName")
	private WebElement middleNameInputField;
	@FindBy(name = "lastName")
	private WebElement lastNameInputField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement IdInputField;
	public void createEmployee(String firstname,String middlename,String lastname,String EmployeeId) {
		typeInput(firstnameInputField, firstname);
		typeInput(middleNameInputField, middlename);
		typeInput(lastNameInputField, lastname);
		typeInput(IdInputField, EmployeeId);
		performClick(IdInputField);
	}
}
