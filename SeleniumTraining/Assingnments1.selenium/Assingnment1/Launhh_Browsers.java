package Assingnment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launhh_Browsers {
	public static void main(String args[]) {
		System.out.println("program has been started");
//		System.setProperty("webdriver.chrome.driver","D:\\Acceleration\\Workspace\\SeleniumTraining\\drivers\\chromedriver.exe");
//		ChromeDriver cdriver=new ChromeDriver();
//		System.out.println("program has been ended");
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
//		FirefoxDriver fdriver=new FirefoxDriver();
//		Generic way to launch a browser:
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
	}

}
