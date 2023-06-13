package aleratNFramesNWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JQuerry2 extends SeleniumUtility{
	@Test
	public void testJquery() throws InterruptedException{
		WebDriver driver=setUp("Chrome","https://jqueryui.com/sortable");
		driver.switchTo().frame(0);
		List<WebElement> items=driver.findElements(By.cssSelector("#sortable>li"));
		for(int i=0;i<items.size()-1;i++) {
			performDragAndDrop(items.get(items.size()-1), items.get(i));
			items=driver.findElements(By.cssSelector("#sortable>li"));
		}
	}
}
