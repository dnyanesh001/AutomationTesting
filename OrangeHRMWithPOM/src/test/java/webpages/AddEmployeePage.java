package webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import utilities.SeleniumUtility;

public class AddEmployeePage extends SeleniumUtility {

	public AddEmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	//FirstName
	@FindBy(name="firstName")
	private WebElement firstNameInputField;
	//LastName
	@FindBy(name="lastName")
	private WebElement lastNameInputField;
	//Employee ID
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement epmloyeeIdInputField;
	//Save button
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButtonOnAddEmployeePage;
	//Function: addEmployee
	public void createEmployee(String firstName,String lastName,int empId) {
		typeInput(firstNameInputField, firstName);
		typeInput(lastNameInputField, lastName);
		setSleepTime(2000);
		getActiveElementFromUI().sendKeys(Keys.TAB,Keys.BACK_SPACE);
		waitForElementDisplayed(epmloyeeIdInputField);
		typeInput(epmloyeeIdInputField, String.valueOf(empId));
		clickOnElement(saveButtonOnAddEmployeePage);
	}
}
