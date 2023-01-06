package Assingnment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl_PageTitle_TitleLength {
	public static void main(String args[]) {
		System.out.println("program has been started");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		System.out.println("page title"+driver.getTitle());
		System.out.println("pagesource: "+driver.getPageSource());
		System.out.println("length of the title: "+driver.getTitle().length());
		System.out.println("length of the page source"+driver.getPageSource().length());
		System.out.println("page length of the source code: "+driver.getWindowHandle().length());
		
		System.out.println("program has been ended");
	}

}
