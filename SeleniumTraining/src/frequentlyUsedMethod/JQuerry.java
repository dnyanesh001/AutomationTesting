package frequentlyUsedMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class JQuerry {
	static WebDriver driver;
	public static void main(String[] args) {
		SeleniumUtility util = new SeleniumUtility();
		driver=util.setUp("chrome","https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		//taking control inside the frame from main page using index
		//driver.switchTo().frame(0);
		
		//taking control inside the frame from main page using WebElement
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);		
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		util.performDranAndDrop(src, target);
		//coming back to main page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
	    //util.cleanUp();
	}

}
