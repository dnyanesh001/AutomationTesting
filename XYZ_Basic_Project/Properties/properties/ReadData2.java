package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData2 {
	public static void main(String args[]) throws IOException {
		//Properties file location
		String fileLocation=".\\MyProp\\TextData.properties";
		//Create instance of FileInputStream Class and pass location to its constructor
		FileInputStream fis = new FileInputStream(fileLocation);
		//Create Instance of Properties class 
		Properties prop=new Properties();
		//Call load method of property file 
		prop.load(fis);
		//use getProperty(String key) to read specified key value for property file
		String Username=prop.getProperty("username");
		System.out.println(Username);
	}

	
}
