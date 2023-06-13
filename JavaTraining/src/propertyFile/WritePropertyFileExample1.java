package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFileExample1 {

	public static void main(String[] args) throws IOException {
		/**
		 1. find property file location and create an instance of FileInputStream class and pass file location into its constructor
		 */
		//Property file relative location ---> "." indicate current working dir
		FileInputStream fis=new FileInputStream(".\\PropertyFiles\\AppData.properties");
		/*2. create an instance of Properties class */
		Properties prop=new Properties();
		/*3. using Properties class reference call load() and pass FileInputStream instance as an argument */
		prop.load(fis);
		/*4. using Properties class reference call getProperty(String key) which will return value for passed key*/
		String name=prop.getProperty("name");
		System.out.println("Name is: "+name);
		
		prop.setProperty("name", "Rahul");
		
		/*To save file*/
		FileOutputStream fos=new FileOutputStream(".\\PropertyFiles\\AppData.properties");
		prop.store(fos, "Updated name for user");
		fos.flush();
		fos.close();
		System.out.println("Updated data");
		System.out.println("Updated name: "+prop.getProperty("name"));
	}

}
