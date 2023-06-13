package brokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class BrokenLinkExample2 extends SeleniumUtility{
	@Test
    public void testLinks() {
        setUp("chrome","https://demoqa.com/broken");
        //Storing the links in a list and traversing through the links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        // This line will print the number of links and the count of links.
        System.out.println("No of links are "+ links.size());        
        //checking the links fetched.
        for(int i=0;i<links.size();i++)
        {
            String url=links.get(i).getAttribute("href");
            verifyLinks(url);
        }        
        driver.quit();
    }
    
    
    public static void verifyLinks(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);
            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            System.out.println("Response code is: "+httpURLConnect.getResponseCode());
            if(httpURLConnect.getResponseCode()>=400)
            {
            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
            }           
            //Fetching and Printing the response code obtained
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
      }
   }
}
