package javaScriptExecuterEX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example1 extends SeleniumUtility{
	@Test
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		//identify Signin button using selenium
		WebElement element=driver.findElement(By.cssSelector(".buttonBlue"));
		//COnvert driver instance to JavaScriptExecutor interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//perform click operation using JavaScriptExecutor
		js.executeScript("arguments[0].click();", element);	
	}
	
	@Test
	public void testCase2() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		//COnvert driver instance to JavaScriptExecutor interface
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Identify Signin button using JavaScript and also perform click operation
		js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
	}
}