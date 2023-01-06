package frequentlyUsedMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	public static void main(String args[]) {
		System.out.println("Program has been started : ");
		// setup the required driver executable path using - System.setProperty(String
		// key, String value)
		//setup the required driver executable path using - System.setProperty(String key,String value);
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String pageTitle=driver.getTitle();
		System.out.println("Page title is: "+pageTitle);
		System.out.println("page title is: "+driver.getTitle());
		String StrTIitle=driver.getTitle();
		System.out.println("page title validation: "+ StrTIitle.equals("Facebook – log in or sign up"));
		String page_Source=driver.getPageSource();
		System.out.println("Page source is = "+page_Source);
		System.out.println("Program has been ended : ");
	}

}
