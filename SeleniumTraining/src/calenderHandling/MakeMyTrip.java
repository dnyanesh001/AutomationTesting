package calenderHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {
	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.makemytrip.com/"); 
		//to handle offer popup
		try {
			driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.className("close")));
			driver.findElement(By.cssSelector(".close")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		driver.findElement(By.cssSelector(".menu_Buses .chNavText.darkGreyText")).click();
		//identify departure date and click on it
		driver.findElement(By.cssSelector("div[aria-label='Wed Jan 18 2023']")).click();
//		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(3)>div>p")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#fromCity")));
		driver.findElement(By.id("fromCity")).sendKeys("Pune");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#react-autowhatever-1-section-0-item-0")));
		driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0")).click();
		WebElement toDestination=driver.findElement(By.cssSelector("[for='toCity']"));
		toDestination.click();
		toDestination.sendKeys("Mumbai");
		driver.findElement(By.cssSelector("#react-autowhatever-1-section-0-item-0")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#superOffersTab_FLIGHTS>span")));
//		driver.findElement(By.cssSelector("#superOffersTab_FLIGHTS>span")).click();
//		FromOpt.get(0).click();
		//select date from next month
//		driver.close();
	}


}
