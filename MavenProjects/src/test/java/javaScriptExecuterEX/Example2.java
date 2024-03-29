package javaScriptExecuterEX;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Example2 extends SeleniumUtility{
	@Test 
	public void testCase1() {
		WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//identifying elements from using javaScript and typing required value in it 
		js.executeScript("document.getElementById('username').value='admin'");
		//identifying element from the UI using JavaScript and typing required value in it
		js.executeScript("document.getElementsByClassName('textField pwdfield')[0].value='manager'");
		//identifying elements from the UI using typing required value in it
		//js.executeScript("document.getElementByName('pwd')[0].value='manager'");
		WebElement element=driver.findElement(By.id("loginButton"));
		js.executeScript("arguments[0].click();", element);
		js.executeScript("history.go(0)");
	}
}
