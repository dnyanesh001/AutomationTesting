package actitmeScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actitimePages.ActiTimeLoginPage;
import actitimePages.Deletepage;
import actitimePages.Editpage;
import actitimePages.EnterTimeTrackPage;
import actitimePages.TaskListpage;
import utilities.SeleniumUtility;

public class ActitimeScripts extends SeleniumUtility {
	ActiTimeLoginPage getActiTimeLoginPage;
	EnterTimeTrackPage getEnterTimeTrackPage;
	TaskListpage getTaskListpage;
	Editpage getEditpage;
	Deletepage getDeletepage;
	String username="admin",password="manager";
	@BeforeTest
	public void startactitime() {
		WebDriver driver = setUp("chrome", "https://demo.actitime.com/login.do");
		getActiTimeLoginPage = new ActiTimeLoginPage(driver);
		getEnterTimeTrackPage = new EnterTimeTrackPage(driver);
		getTaskListpage = new TaskListpage(driver);
		getEditpage = new Editpage(driver);
		getDeletepage = new Deletepage(driver);
	}
	@Test
	public void loginActitime() {
		getActiTimeLoginPage.loginOperation(username, password);
	}
	@Test
	public void createTaskActitime() {
		getEnterTimeTrackPage.clickOnTask();
		getTaskListpage.creatTask("testing");
	}

	@Test
	public void editTaskActitime() {
		getTaskListpage.editTask();
		getEditpage.EnterEstimatedTime("11:00");

	}

	@Test
	public void deleteTaskActitime() {
		getTaskListpage.selectCheckBox();
		getDeletepage.deleteTaskMethod();
	}

	@AfterTest
	public void ends() {

//		 tearDown();

		// }

	}
}