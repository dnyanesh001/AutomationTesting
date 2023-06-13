package actitimePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class EnterTimeTrackPage extends SeleniumUtility {
	
	public EnterTimeTrackPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_tasks")
	private WebElement Tasksection;

	public void  clickOnTask() {
		
		performClick(Tasksection);
		
	}
}

