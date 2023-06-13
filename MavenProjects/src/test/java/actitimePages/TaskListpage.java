package actitimePages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TaskListpage extends SeleniumUtility {
	
	public TaskListpage (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(css=".title.ellipsis")
	private WebElement AddNewButton;
	
	@FindBy(css=".createNewTasks")
	private WebElement NewTaskButton;
	
	@FindBy(css=".customerSelector .dropdownButton")
	private WebElement CustomerDropdown;
	
	
	@FindBy(xpath="//div[@class='contentWrapper ']/div/div[text()='Galaxy Corporation']")
	private WebElement SelectedCustomerOption;
	
	@FindBy(css=".projectSelector .dropdownButton")
	private WebElement ProjectDropdown;
	
	@FindBy(xpath="//div[@class='contentWrapper ']/div/div[text()='Android prototyping']")
	private WebElement SelectedProjectOption;
	
	@FindBy(css="tr:nth-of-type(1)>td:nth-of-type(1)>input[placeholder='Enter task name']")
	private WebElement EnterTaskNameField;

	@FindBy(css=".commitButtonPlaceHolder .components_button_label")
	private WebElement CreateTaskButton;

	@FindBy(css="div[title='testing']")
	private WebElement TestingForEditButton;
	
	
	@FindBy(xpath="//tr[td[2][div[div[div[div[text()='testing']]]]]]/td/div/div")
	private WebElement TestingTaskCheckbox;
	
	public void creatTask(String task) {
		performClick(AddNewButton);
		waitForElementDisplayed(NewTaskButton);
		performClick(NewTaskButton);
		performClick(CustomerDropdown);
		performClick(SelectedCustomerOption);
		performClick(ProjectDropdown);
		performClick(SelectedProjectOption);
		typeInput(EnterTaskNameField,task);
		performClick(CreateTaskButton);
			
	}
	
	public void editTask() {
		try {
			performClick(TestingForEditButton);
		}
		catch (StaleElementReferenceException e) {
			performClick(TestingForEditButton);
		}
			
	}
	
	public void selectCheckBox() {
		
		performClick(TestingTaskCheckbox);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
