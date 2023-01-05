package aleratNFramesNWindows;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintMenuAndSubMenu {
	 public static void main(String[] args) throws InterruptedException {
		 	WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	        driver.get("http://www.espncricinfo.com/");
	        List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='mainNav']//td[contains(@class,'nav')]/a")); //this will return all the main menu options total 15 from home button to Mobile
	        Actions act = new Actions(driver);
	       
	        for(int i=1; i<mainMenu.size(); i++){ //here i has been initialized from 1 because we want to print from Series till Mobile
	            String mainMenuName = mainMenu.get(i).getText();
	            System.out.println("Main Menu Name- "+mainMenuName);
	            String xpath = "//div[@id='mainNav']//td[contains(@class,'nav')][a[text()='"+mainMenuName+"']]"; //here xpath has been written for independent element of submenu so used []
	               
	            act.moveToElement(mainMenu.get(i)).perform(); //move the cursor over main menu , like over series sothat submenu will be visible
	            //to get all the submenu in list
	            List<WebElement> subMenuItems = driver.findElements(By.xpath(xpath+"//a[@class='PopupLinks']"));
	            int sizeOfSubMenu = subMenuItems.size();
	            //System.out.println("Number of submenu items:"+ subMenuItems.size());
	            System.out.print("Submenu options of "+mainMenuName+" are: ");
	            if(sizeOfSubMenu==0){
	                System.out.print("There is no submenu option under "+mainMenuName);
	            }
	            //below for loop is to print submenu
	            for(int j=0; j<sizeOfSubMenu; j++){
	                System.out.print(j+")"+subMenuItems.get(j).getText()+", ");
	               
	                if(mainMenuName.equals("Features") && j==0){
	                    List<WebElement> subMenuOptions = driver.findElements(By.xpath(xpath+"//span"));
	                    //this loop is to print "Features" menu three options Regulars, Highlights and Opinion
	                    for(int k=0; k<subMenuOptions.size(); k++){
	                        j++;
	                        System.out.print(j+")"+subMenuOptions.get(k).getText()+", ");
	                    }
	             }
	            }
	            System.out.println();
	            System.out.println("==============================================================================");
	       
	    }
	        driver.quit();
	}
}
