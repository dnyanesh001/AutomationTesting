package testNgPart2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleApplicationWithBeforeAndAfterTest extends SeleniumUtility{
	WebDriver driver;
	@BeforeTest
	public void startUp() {
		driver=setUp("chrome", "https://www.google.com/");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle="Google";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle, actualTitle, "Google page not opend or its title got changed");
	}
	@Test
	public void testSearch() {
		getActiveElementFromUI().sendKeys("SQL",Keys.ENTER);
	}
	@AfterTest
	public void tearDown() {
		cleanUp();
	}
	
}
/**
 * precondition: open browser and enter google URL
 * 							TC1:validation google page
 * 							TC2:search SQL and validation search result page
 * post-condition: close browser
 */
 

