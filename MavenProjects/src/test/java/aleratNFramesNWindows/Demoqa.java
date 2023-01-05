package aleratNFramesNWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqa {
	public static void main(String[] args) {
		System.out.println("Program started");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='card mt-4 top-card'][div/div[@class='card-body']/h5[text()='Alerts, Frame & Windows']]//div[@class='card-up']")));
//		driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][div/div[@class='card-body']/h5[text()='Alerts, Frame & Windows']]//div[@class='card-up']")).click();
//		driver.findElement(By.xpath("//ul/li[2]/span[text()='Alerts']")).click();		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("Hii I am Dnyanesh");
		System.out.println("Program Ended");
	}
}
