package aleratNFramesNWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class JQuerry {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Program startd");
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("Chrome","https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		List<WebElement> items=driver.findElements(By.cssSelector("ul#sortable>li"));
		for(int i=0;i<items.size();i++) {
			util.performDranAndDrop(items.get(items.size()-1), items.get(i));
			items=driver.findElements(By.cssSelector("ul#sortable>li"));
		}
		
	}
}
