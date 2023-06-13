package aleratNFramesNWindows;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class Actitime extends SeleniumUtility{
	public static void main(String[] args) {
		System.out.println("Program Strats");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector .selectedItem")));
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		List<WebElement> projectList=driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
		projectList.get(3).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing4");
		driver.findElement(By.cssSelector(".x-btn-text")).click();
		driver.findElement(By.cssSelector("a[title='Next Month (Control+Right)']")).click();
		
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(3)>a>em>span")).click();
		
		driver.findElement(By.cssSelector(".taskTableContainer .value.ellipsis")).click();
		
		driver.findElements(By.xpath("//div[text()='research']")).get(3).click();
		
		driver.findElement(By.cssSelector(".basicLightboxFooter .components_button_label")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[div/div/div/div[text()='Testing4']]//preceding-sibling::td/div/div[@class='img']")));
//		driver.findElement(By.xpath("//td[div/div/div/div[text()='Testing4']]//preceding-sibling::td/div/div[@class='img']")).click();
		try {
			driver.findElement(By.xpath("//td[div/div/div/div[text()='Testing4']]//preceding-sibling::td/div[@class='checkbox inactive']")).click();
		}catch (InvalidSelectorException e) {
			driver.findElement(By.xpath("//td[div/div/div/div[text()='Testing4']]//preceding-sibling::td/div[@class='checkbox inactive']")).click();
		}
		try {
			driver.findElement(By.cssSelector(".delete.button")).click();
			driver.findElement(By.cssSelector(".deleteDialog .operationConfirmDialogInnerContainer .buttonsContainer .submitTitle.buttonTitle")).click();
		}catch (ElementClickInterceptedException e) {
			driver.findElement(By.cssSelector(".delete.button")).click();
			driver.findElement(By.cssSelector(".deleteDialog .operationConfirmDialogInnerContainer .buttonsContainer .submitTitle.buttonTitle")).click();
		}
		System.out.println("Program Ended");
		
	}
}
