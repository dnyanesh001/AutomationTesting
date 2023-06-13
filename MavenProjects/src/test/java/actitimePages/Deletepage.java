package actitimePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Deletepage extends SeleniumUtility {
	
	public Deletepage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".delete.button")
	private WebElement DeleteButton;
	
	@FindBy(xpath="//div[span[text()='Delete permanently']]")
	private WebElement DeletePermanantlyButton;
	
	
	public void deleteTaskMethod() {
		performClick(DeleteButton);
		performClick(DeletePermanantlyButton);
		
	}
}
