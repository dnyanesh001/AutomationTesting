package handlingMultipleElments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationTesting {
	public static void main(String[] args) {
		System.out.println("Program starts");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println("Links counts is :"+Links.size());
		List<WebElement> Inputs=driver.findElements(By.tagName("input"));
		System.out.println("Links counts is :"+Inputs.size());
		Inputs.get(0).sendKeys("Dnyanesh");
		Inputs.get(1).sendKeys("Bhole");
		Inputs.get(2).sendKeys("ChickhliPune");
		Inputs.get(3).sendKeys("Chickhli@DotMail.com");
		Inputs.get(4).sendKeys("9837564637");
		Inputs.get(5).sendKeys("BestGamer");
		Inputs.get(6).sendKeys("India");
		Inputs.get(7).sendKeys("2012");
		Inputs.get(8).sendKeys("11");
		Inputs.get(9).sendKeys("4");
		Inputs.get(10).sendKeys("sagr2012");
		Inputs.get(11).sendKeys("sagr2012");
		System.out.println("program ends");
		
	}
}
