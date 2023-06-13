package aleratNFramesNWindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SausenDemo {
	public static void main(String[] args) {
		System.out.println("Program Start");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement user=driver.findElement(By.xpath("//div[@id='login_credentials']"));
		System.out.println(user.getText());
		String str1=user.getText();
		String str=str1.replace("Accepted usernames are:", "");
		String StrArray[]= str.split("user");	
		
		for(String i:StrArray) {
			i=i+"user";
			driver.findElement(By.id("user-name")).sendKeys(Keys.CONTROL,Keys.chord("a"),Keys.BACK_SPACE);
			driver.findElement(By.id("user-name")).sendKeys(i,Keys.TAB);
			driver.switchTo().activeElement().sendKeys("secret_sauce");
			driver.switchTo().activeElement().sendKeys(Keys.TAB,Keys.ENTER);
			System.out.println(i);
		}
		System.out.println("Program Ends");
	}
}
