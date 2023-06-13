package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class VtigerHomePage extends SeleniumUtility{
	WebDriver driver;
	public VtigerHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#appnavigator")
	private WebElement flowNavigator;
	
	@FindBy(css=".app-list>div:nth-of-type(2) .menu-items-wrapper>.textOverflowEllipsis")
	private WebElement selectMarketingOption;
	
	@FindBy(css=".dropdown.open>ul .mCSB_container>li>a>span:nth-of-type(2)")
	private List<WebElement> selectSubMenusOption;
	
	@FindBy(xpath="//a[@title='Contacts']")
	private WebElement selectContactsOption;
	
	public void navigateToLeadsPage(int optionIndex) {
		clickOnElement(flowNavigator);
		clickOnElement(selectMarketingOption);
		clickOnElement(selectSubMenusOption.get(optionIndex));
	}
}
