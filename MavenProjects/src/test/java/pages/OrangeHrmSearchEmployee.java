package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHrmSearchEmployee extends SeleniumUtility{
	public OrangeHrmSearchEmployee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[2]/input[@class='oxd-input oxd-input--active']")
	private WebElement EmployeeIdfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButton;
	public void searchEmployee(String EmployeeId) {
		typeInput(EmployeeIdfield, EmployeeId);	
		performClick(searchButton);
	}
}
