package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Login into OrangeHrm
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
		driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
		//click on Add button
		driver.findElement(
				By.cssSelector(".orangehrm-header-container>button"))
				.click();
		//Fill Employee details
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Avinash", Keys.TAB, "Ramensh",
				Keys.TAB, "Bhole", Keys.TAB, "2335555");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//search created employee
		driver.findElement(By.xpath("//li/a/span[text()='PIM']")).click();
		driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")).sendKeys("2335555");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
			driver.findElement(
					By.cssSelector(".oxd-table-body>div:nth-child(1) label>input"))
					.click();
			driver.findElement(By.cssSelector(".oxd-icon.bi-trash")).click();
			driver.findElement(By.cssSelector(".oxd-icon.bi-trash.oxd-button-icon")).click();
			Thread.sleep(2000);
		System.out.println("Is Employee is deleted "
				+ driver.findElement(By.xpath("//span[text()='No Records Found']")).isDisplayed());
		System.out.println("Program ends");
	}

}
