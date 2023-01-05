package switchToActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTesting {
	public static void main(String[] args) {
		System.out.println("Program Started");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Dnaynesh",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("BHole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("They Never loose hope But and try to goal is reach",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("DarkTheConqueror@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("7080828999",Keys.TAB);
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//li/a[text()='Hindi']")).click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/span[1]/span[1]/span[1]")).click();
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("DnyaneshBHole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("DnyaneshBhole",Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().click();
		System.out.println("program ended");
	}

}
