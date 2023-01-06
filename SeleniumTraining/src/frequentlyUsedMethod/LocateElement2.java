package frequentlyUsedMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElement2 {
	public static void main(String args[] ) {
		System.out.println("Program has been started");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("lb dnyanesh bhole");
		driver.findElement(By.id("pass")).sendKeys("dnyanesh123@");
		driver.findElement(By.name("login")).click();
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println("The page is integrated to hom page: "+driver.getTitle().equals("log in or sign up"));
		System.out.println("Prgram has been ended");
		driver.close();
	}

}