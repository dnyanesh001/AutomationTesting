package assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public static void main(String[] args) {
		System.out.println("Program Strat");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("getTitle: "+driver.getTitle());
		System.out.println(driver.getTitle().equals("Sign up for Facebook | Facebook"));
		
		List<WebElement> element=driver.findElements(By.cssSelector("._42ft "));
		//Explicitly wait
		WebDriverWait wait=new WebDriverWait(driver,30);		
		wait.until(ExpectedConditions.elementToBeClickable(element.get(1)));
		element.get(1).click();
		List<WebElement> ele=driver.findElements(By.cssSelector("._9407"));
		for(int a=0;a<ele.size();a++) {
			ele.get(a).click();
			System.out.println(" Is Element visible: "+ele.get(a).isDisplayed());
			System.out.println(" IS Eneble: "+ele.get(a).isEnabled());
			List<WebElement> DateOp=driver.findElements(By.cssSelector("#day>option"));
			List<WebElement> DateOp1=driver.findElements(By.cssSelector("#month>option"));
			List<WebElement> DateOp2=driver.findElements(By.cssSelector("#year>option"));
			Select s1 =  new Select(ele.get(a));
			if(a==0) {
				System.out.println(" is day is multi select"+s1.isMultiple());
				System.out.println("Total days Count is"+DateOp.size()+"\n");
				for(int b=0;b<DateOp.size();b++) {
					System.out.print(" day "+DateOp.get(b).getText());
				}
			}else if(a==1) {
				System.out.println(" is day is multi select"+s1.isMultiple());
				System.out.println("Total days Count is"+DateOp.size()+"\n");
				for(int b=0;b<DateOp1.size();b++) {
					System.out.print(" month "+DateOp1.get(b).getText());
				}
			}if(a==2) {
				System.out.println(" is day is multi select"+s1.isMultiple());
				System.out.println("Total days Count is"+DateOp.size()+"\n");
				for(int b=0;b<DateOp2.size();b++) {
					System.out.print(" year "+DateOp2.get(b).getText());
					DateOp2.get(b).clear();
					DateOp2.get(b).sendKeys("0000");
				}
				System.out.println();
				for(int b=0;b<DateOp2.size();b++) {
					System.out.print(" year "+DateOp2.get(b).getText());
				}
			}
		}
		System.out.println("Program Eneds");
	}
}
