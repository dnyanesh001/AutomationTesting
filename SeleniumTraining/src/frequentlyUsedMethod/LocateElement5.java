package frequentlyUsedMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateElement5 {
	public static void main(String args[]) {
		System.out.println("Pragarm Started");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("lb dnyanesh bhole");
		driver.findElement(By.id("pass")).sendKeys("dnyanesh123@");
		driver.findElement(By.name("login")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedCondition.titleContains("(2) Facebook"));
		System.out.println("Pragarm ended");
		//driver.close();
	}

}
