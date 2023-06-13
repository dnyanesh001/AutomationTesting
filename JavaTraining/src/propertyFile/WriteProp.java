package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProp {

	public static void main(String[] args) throws IOException {
		/**property file location - using relative path, "." indicates current working directory
		 * Create instance of FileInputStream class and pass file location to its constructor
		 */
		FileInputStream fis = new FileInputStream(".\\MyProp\\TestData.properties");
		// create an instance of Properties class
		Properties prop = new Properties();
		// call load method of property class to load property file
		prop.load(fis);
		System.out.println("Password from property file: " + prop.getProperty("password"));
		
		prop.setProperty("Position", "Delivery Manager");
		//to save changes, get the file location and pass it to FileOutput stream class constructor
		FileOutputStream fos=new FileOutputStream(".\\MyProp\\TestData.properties");
		prop.store(fos, "Added position");
		//flush the content into a property file
		fos.flush();
		//close property file instance
		fos.close();
		System.out.println("Updated");
	}
}
/**
1. Open any browser and enter the url as https://www.selenium.dev/downloads/
2. Goto "Previous Releases" and click in "Releases" link
3. Expand "Selenium 3.141.59", click on "selenium-java-3.141.59.zip" and save the file into required location
4. Close the popup
5. Goto "Platforms Supported by Selenium"
6. Expand Browsers Section, 
	for firefox click on "Documentation" link
		click on " geckodriver releases", under latest version section goto "Assets"
		click on "geckodriver-v0.32.0-win32.zip" and save it into the required location
	for chrome click on "documentation " link
		depending upon your chrome browser version download "ChromeDriver 10X.X.XXXX.XX"
 */ 
