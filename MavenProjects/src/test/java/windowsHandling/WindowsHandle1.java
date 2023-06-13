package windowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class WindowsHandle1{
	public static void main(String[] args) {
		System.out.println("Program starts");
		SeleniumUtility S1=new SeleniumUtility();
		WebDriver driver=S1.setUp("chrome","https:etrain.info/in");
		String HomePageWinId=driver.getWindowHandle();//T1
		System.out.println("The title of curren window is: "+HomePageWinId);
		//performing click operation to open linked in page in new tab
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();
		//get all windows unique IDs which are open by selenium current instance
		Set<String> allWindID=driver.getWindowHandles();
		System.out.println("All Windows Id: "+allWindID);
		//remove home window id from all windows id then you will get child windows id
		allWindID.remove(HomePageWinId);//T2
		System.out.println("After removing homr window ID , all window id: "+allWindID);
		//get child window id using iterator
		Iterator<String> itr=allWindID.iterator();
		String childWindowId=itr.next();
		//now you can control from main window to child window
		driver.switchTo().window(childWindowId);
//		or
//		switch to control child windows
//		driver.switchTo().window(allWindID.iterator().next());
//		now you are allowed to Identify any element from child windows
		System.out.println("Linked Id Page title: "+driver.getTitle());
		System.out.println("Linked id page url: "+driver.getCurrentUrl());
		//close current instance of browser
//		driver.close();
//		close all the driver instances opened by webdriver
		driver.quit();
		System.out.println("Program ends");
	}
}
