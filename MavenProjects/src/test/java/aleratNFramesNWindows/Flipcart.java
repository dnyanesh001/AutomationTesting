package aleratNFramesNWindows;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.className("_2doB4z")).click();;
		List<WebElement> MenuElements=driver.findElements(By.className("xtXmba"));
		System.out.println(MenuElements.size());
		Actions act=new Actions(driver);
		for(int a=0;a<MenuElements.size();a++) {
			try {
				System.out.println( MenuElements.get(a).getText());
				if(MenuElements.get(a).isEnabled()) {
					act.moveToElement(MenuElements.get(a)).perform();
					List<WebElement> subMenup=driver.findElements(By.cssSelector("._3XS_gI._7qr1OC>a"));
					for(int i=0;i<subMenup.size();i++) {
						System.out.print(subMenup.get(i).getText()+" ");
						act.moveToElement(subMenup.get(i)).perform();
						List<WebElement> subMenuc=driver.findElements(By.cssSelector("div>._6WOcW9._3YpNQe"));
						for(int j=0;j<subMenuc.size();j++) {
							act.moveToElement(subMenuc.get(j)).perform();
							System.out.print(subMenuc.get(j).getText()+" ");
						}
						System.out.println();
					}
					System.out.println();
				}
			} catch (StaleElementReferenceException e) {
				System.out.println( driver.findElement(By.xpath("//img[@alt='Two Wheelers']")).getAttribute("alt"));
				if(driver.findElement(By.xpath("//img[@alt='Two Wheelers']")).isEnabled()) {
					act.moveToElement(driver.findElement(By.xpath("//img[@alt='Two Wheelers']"))).perform();
					List<WebElement> subMenup=driver.findElements(By.cssSelector("._3XS_gI._7qr1OC>a"));
					for(int i=0;i<subMenup.size();i++) {
						System.out.print(subMenup.get(i).getText()+" ");
						act.moveToElement(subMenup.get(i)).perform();
					}
					System.out.println();
				}
			}
		}
		 
		System.out.println("Program Ended");
	}

}
