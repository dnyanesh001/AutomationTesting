package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRMHomePage extends SeleniumUtility{
	public OrangeHRMHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//li/a/span[text()='PIM']")
	private WebElement pimButton;
	@FindBy(css = ".orangehrm-header-container.oxd-button.oxd-button--medium.oxd-button--secondary")
	private WebElement addPimButton;
	@FindBy(linkText = "Employee List")
	private WebElement EmployeeList;
	@FindBy(xpath = "//div[@class='oxd-table-body']//div[@class='oxd-checkbox-wrapper']/label/span/i")
	private WebElement DeleteButton;
	public void getInPimField() {
		waitForELementDisplayed(pimButton);
		performClick(pimButton);
	}
	public void createPimField() {
		performClick(addPimButton);
	}
	public void searchPimField() {
		performClick(EmployeeList);
	}
	public void deleteEmployeeField() {
		performClick(DeleteButton);
	}
}
