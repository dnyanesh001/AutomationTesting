package pageScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;
import pages.OrangeHrmCreatePim;
import pages.OrangeHrmDeleteEmployee;
import pages.OrangeHrmSearchEmployee;
import utilities.SeleniumUtility;

public class OrangeHRM extends SeleniumUtility{
	OrangeHRMLoginPage getOrangeHRMLoginPage;
	OrangeHRMHomePage getOrangeHRMHomePage;
	OrangeHrmCreatePim creatOrangeHrmCreatePim;
	OrangeHrmSearchEmployee searchOrangeHRMEmployee;
	OrangeHrmDeleteEmployee deleteOrangeHRMEmployee;
	@BeforeTest
	public void startup() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHRMLoginPage=new OrangeHRMLoginPage(driver);
		getOrangeHRMHomePage=new OrangeHRMHomePage(driver);
		creatOrangeHrmCreatePim=new OrangeHrmCreatePim(driver);
		searchOrangeHRMEmployee=new OrangeHrmSearchEmployee(driver);
		deleteOrangeHRMEmployee=new OrangeHrmDeleteEmployee(driver);
	}
	@Test
	public void testOrangeHRMLoginFeature() {
		getOrangeHRMLoginPage.LoginInOrangeHRM("Admin","admin123");
	}
	@Test
	public void testOrangeHRMHomeFeature() {
		getOrangeHRMHomePage.getInPimField();
	}
	@Test
	public void testOrangeHRMCreateEmp() {
		getOrangeHRMHomePage.createPimField();
		creatOrangeHrmCreatePim.createEmployee("Dnyanesh", "Nitin", "Bhole", "9272");
	}
	@Test
	public void testOrangeHRMsearchEmp() {
		getOrangeHRMHomePage.searchPimField();
		searchOrangeHRMEmployee.searchEmployee("9272");
	}@Test
	public void testOrangeHRMdeleteEmp() {
		getOrangeHRMHomePage.deleteEmployeeField();
		deleteOrangeHRMEmployee.deleteEmployee();
	}
	@AfterTest
	public void ends() {
//		cleanUp();
	}
}
