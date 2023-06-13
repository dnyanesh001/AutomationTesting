package actitimePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Editpage extends SeleniumUtility {
	
	public Editpage (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".estimatedTimeWrapper .value")
	private WebElement EstimatedTimeField;
	
    public void	EnterEstimatedTime(String text) {
    	typeInput(EstimatedTimeField,text);
    	
    	
    }
}
