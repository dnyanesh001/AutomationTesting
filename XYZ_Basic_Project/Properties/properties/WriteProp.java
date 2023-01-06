package properties;

import java.io.FileInputStream;
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
