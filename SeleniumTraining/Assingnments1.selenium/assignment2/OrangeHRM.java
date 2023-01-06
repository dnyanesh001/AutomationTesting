package assignment2;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String args[]) {
		System.out.println("Program has been Started");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Title verification is OrangeHRM  "+drive.getTitle().equals("OrangeHRM"));
		System.out.println("Current url of the Orangehrm is: "+drive.getCurrentUrl());
		System.out.println("IS Current url is: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\t"+drive.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		System.out.println("program ended");
	}

}
