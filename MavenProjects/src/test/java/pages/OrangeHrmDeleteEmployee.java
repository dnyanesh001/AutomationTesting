package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHrmDeleteEmployee extends SeleniumUtility{
	public OrangeHrmDeleteEmployee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".oxd-icon.bi-trash")
	private WebElement deleteOption;
	@FindBy(css = ".oxd-icon.bi-trash.oxd-button-icon")
	private WebElement deleteIcon;
	@FindBy(xpath = "//span[text()='No Records Found']")
	private WebElement checkcount;
	public void deleteEmployee() {
		performClick(deleteOption);
		performClick(deleteIcon);
	}
}
