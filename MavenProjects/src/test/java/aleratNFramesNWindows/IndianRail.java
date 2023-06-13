package aleratNFramesNWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndianRail {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.indianrail.gov.in/enquiry/StaticPages/StaticEnquiry.jsp?StaticPage=index.html");
		driver.findElement(By.linkText("Indian Railways Enquiry")).click();
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY')]")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Reserved Train Between Stations')]")).click();
		driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
		driver.findElement(By.xpath("//body/div[@id='askDishaSdk']/div[@id='askDishaLuncher']/img[1]")).click();
		driver.findElement(By.id("sourceStation")).sendKeys("PUNE JN - PUNE",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("JALGAON JN - JL",Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.TAB);
		driver.switchTo().activeElement().click();
		System.out.println("Program Ends");
	}
}
