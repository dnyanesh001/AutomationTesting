package testNgPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleApplicationWithBeforeAfter extends SeleniumUtility{
	WebDriver driver;
	@BeforeTest
	public void  StartUp() {
		driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.cssSelector(".buttonBlue")).click();
	}
	@Test(priority=2)
	public void testVtingerHomePage() {
		String expectedTitle="Dashboard";
		String ActualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle,ActualTitle,"Vtiger home page are not opende or its title got changed");
	}
	@Test(priority=1)
	public void testReportsPage() {
		driver.findElement(By.cssSelector(".navbar-nav>*:nth-child(3)>div>a")).click();
		String expectedTitle="Reports";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle, actualTitle,"Report page is not opend or its title got changed");
	}
	@AfterMethod 
	public void logout(){
		driver.findElement(By.cssSelector(".userName")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}
	@AfterTest
	public void teardown() {
		cleanUp();
	}
}
