package frequentlyUsedMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLogin {
	public static void main(String args[]) {
		System.out.println("Program has been started: ");
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		WebDriver drive=new FirefoxDriver();
		drive.get("https://demosite.executeautomation.com");
		drive.findElement(By.name("UserName")).sendKeys("execution");
		drive.findElement(By.name("Password")).sendKeys("admin");
	    WebElement m=drive.findElement(By.name("Login"));
	    m.submit();
		System.out.println("Title of the web pages: "+drive.getTitle());
		System.out.println("Get page url"+drive.getCurrentUrl());
		WebElement m1=drive.findElement(By.tagName("Logout"));
		m1.click();
		System.out.println("Program has been ended: ");
	}

}
