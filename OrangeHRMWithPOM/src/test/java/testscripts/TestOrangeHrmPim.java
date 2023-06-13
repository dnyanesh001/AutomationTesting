package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.AddEmployeePage;
import webpages.HomePage;
import webpages.LoginPage;
import webpages.PimHomePage;

public class TestOrangeHrmPim extends SeleniumUtility{

	LoginPage getLoginPage;
	HomePage getHomePage;
	PimHomePage getPimHomePage;
	AddEmployeePage getAddEmployeePage;
	@BeforeTest
	public void precondition() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getLoginPage=new LoginPage(driver);
		getHomePage=new HomePage(driver);
		getPimHomePage=new PimHomePage(driver);
		getAddEmployeePage=new AddEmployeePage(driver);
		getLoginPage.loginIntoOrangeHrm("Admin", "admin123");
		getHomePage.clickOnPIM();
	}
	@Test
	public void testPimCreation() {
		getPimHomePage.clickOnAddButton();
		getAddEmployeePage.createEmployee("Mobile", "Lead", 12345);
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(12345);
		String acutalMsg=getPimHomePage.getSearchResultMsg();
		String expectedMsg="(1) Record Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
	@Test(dependsOnMethods="testPimCreation")
	public void testPimEdit() {
		//TODO: 
	}
	
	@Test(dependsOnMethods="testPimCreation")
	public void testPimDeletion() {
		getHomePage.clickOnPIM();
		getPimHomePage=new PimHomePage(driver);
		getPimHomePage.searchCreatedEmployee(12345);
		getPimHomePage.deleteCreatedEmployee();
		String acutalMsg=getPimHomePage.getSearchResultMsg();
		String expectedMsg="No Records Found";
		Assert.assertEquals(acutalMsg, expectedMsg);
	}
	@AfterTest
	public void postcondition() {
		tearDown();
	}
}
