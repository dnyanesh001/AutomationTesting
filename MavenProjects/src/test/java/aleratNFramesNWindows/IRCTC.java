package aleratNFramesNWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[1]/div[1]/p-autocomplete[1]/span[1]/input[1]")).sendKeys("PUNE JN - PUNE",Keys.TAB,Keys.TAB);
		driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[3]/div[1]/app-main-page[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-jp-input[1]/div[1]/form[1]/div[2]/div[1]/div[2]/p-autocomplete[1]/span[1]/input[1]")).sendKeys("JALGAON JN - JL");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		System.out.println("Program Ends");
	}
}
