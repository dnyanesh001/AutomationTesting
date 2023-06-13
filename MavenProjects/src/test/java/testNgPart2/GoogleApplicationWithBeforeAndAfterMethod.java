package testNgPart2;

import org.jsoup.safety.Cleaner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class GoogleApplicationWithBeforeAndAfterMethod extends SeleniumUtility{
	WebDriver driver;
	@BeforeMethod
	public void startup() {
		driver=setUp("chrome","https://www.google.com");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle="Google";
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle, actualTitle,"Google page not opend or its title changed");
	}
	@Test
	public void search() {
		getActiveElement().sendKeys("SQL",Keys.ENTER);
		Assert.assertEquals(getCurrentTitleOfApplication().contains("SQL"),"SQL search is failed");
	}
	@AfterMethod
	public void tearDown() {
		cleanUp();
	}
}
/**
 * pre-condition: open browser and enter google url
 * 	TC1:validation google page
 * post-condition: close the browser
 * 	TC2:validation search SQl and validation search result page
 * post-conditon: close the browser
 */
