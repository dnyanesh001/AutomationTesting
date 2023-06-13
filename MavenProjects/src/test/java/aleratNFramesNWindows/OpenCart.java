package aleratNFramesNWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	public static void main(String[] args) {
		System.out.println("Program Start");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.id("input-username")).sendKeys("Dnyanesh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dnyanesh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Bhole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("DarkTheConqueror",Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Dark@48765");
		System.out.println("Program Ended");
	}
}
