package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileExample2 {

	public static void main(String[] args) throws IOException {
		/**
		 1. find property file location and create an instance of FileInputStream class and pass file location into its constructor
		 */
		//Property file relative location ---> "." indicate current working dir
		String fileLocation=".\\PropertyFiles\\AppData.properties";
		FileInputStream fis=new FileInputStream(fileLocation);
		/*2. create an instance of Properties class */
		Properties prop=new Properties();
		/*3. using Properties class reference call load() and pass FileInputStream instance as an argument */
		prop.load(fis);
		/*4. using Properties class reference call getProperty(String key) which will return value for passed key*/
		String name=prop.getProperty("name");
		System.out.println("Name is: "+name);
		System.out.println("Email id is: "+prop.getProperty("email"));
		System.out.println("Address is: "+prop.getProperty("address"));
		System.out.println("city is: "+prop.getProperty("city"));
	}

}
