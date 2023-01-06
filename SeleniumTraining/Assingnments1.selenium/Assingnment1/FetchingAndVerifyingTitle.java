package Assingnment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAndVerifyingTitle {
	public static void main(String args[]) {
		System.out.println("Program has been started: ");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcwMzI3NzU5LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		System.out.println("Fetch the Title :"+driver.getTitle());
		System.out.println("Comapre actual title and expected tile: "+driver.getTitle().compareTo("Log in to Facebook")+"\t"+driver.getTitle().equals("Log in to Facebook"));
		driver.close();
		System.out.println("program has been ended");
		
	}

}
