package aleratNFramesNWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Jquerry1 extends SeleniumUtility{
  @Test
  public void testJquerry() throws InterruptedException {
	  WebDriver driver=setUp("chrome","https://jqueryui.com/sortable");
//	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(0);
	  Thread.sleep(2000);
	  List<WebElement> items=driver.findElements(By.cssSelector("#sortable>li"));
//	  List<WebElement> items=driver.findElements(By.className("ui-sortable-handle"));
	  for(int i=0;i<items.size()-1;i++) {
		  Thread.sleep(2000);
//		  try {
//			 System.out.println("Target Elements is: "+i);
//			 waitForELementDisplayed(items.get(i));
			 performDragAndDrop(items.get(items.size()-1), items.get(i));	
//		  }catch (MoveTargetOutOfBoundsException e) {
//			 waitForELementDisplayed(items.get(i));
//			 performDranAndDrop(items.get(items.size()-1), items.get(i));	
//		  }
			  Thread.sleep(2000);
		  items=driver.findElements(By.cssSelector("#sortable>li"));
		  
	  }  
//	  performDranAndDrop(items.get(6), items.get(0));/
  }
}
