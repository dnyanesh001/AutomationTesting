package Assingnment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHome {
	public static void main(String args[]) {
		System.out.println("program has been strated: ");
		System.setProperty("webdriver.chrome.driver",".//drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Fetch the url and print it: "+driver.getCurrentUrl());
		System.out.println("Fetch the source code of the webpage and print it\n\t"+driver.getPageSource());
		driver.close();
		System.out.println("program has been ended: ");
	}

}
  