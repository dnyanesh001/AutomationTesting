package frequentlyUsedMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatorsExp {
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=EFj055n4B5c");
		WebElement Play=driver.findElement(By.id("ytp-miniplayer-button"));
		Play.click();
		WebElement input1=driver.findElement(By.className("yt-spec-touch-feedback-shape__fill"));
		input1.click();
		WebElement Search1=driver.findElement(By.id("search"));
		Search1.sendKeys("Dynamo Gaming");
		driver.close();
	}

}
