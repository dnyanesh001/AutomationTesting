package aleratNFramesNWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {
	
	public static void main(String[] args) {
		System.out.println("Program Starts");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[text()=' MARKETING']")).click();
		driver.findElement(By.cssSelector("#mCSB_1_container>li:nth-of-type(3)")).click();
		driver.findElement(By.xpath("//a[text()=' Create']")).click();
		driver.findElement(By.id("s2id_autogen1")).click();
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dnayensh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Bhole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("7448020985",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("AJ",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("7448020985",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("7448020985",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dnayensh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("7448020985",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dnayensh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dnayensh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("DnayenshBhole@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("29-11-2022",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("DnayenshBhole",Keys.TAB);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//button[@id='Contacts_detailView_basicAction_LBL_EDIT']")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Dnyanesh");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//body/div[@id='page']/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[4]")).click();
		driver.findElement(By.linkText("Delete Contact")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		System.out.println("Program Ended");	
	}
}
