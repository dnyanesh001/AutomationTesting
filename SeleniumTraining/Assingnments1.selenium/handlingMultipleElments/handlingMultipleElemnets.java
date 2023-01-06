package handlingMultipleElments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleElemnets {
	public static void main(String[] args) {
		System.out.println("Program Start");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q"));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("links count: "+links.size());
		List<WebElement> Input=driver.findElements(By.tagName("input"));
		System.out.println("links count: "+Input.size());
		System.out.println(links.get(0).getText());
		System.out.println("program ended");
	}
}
