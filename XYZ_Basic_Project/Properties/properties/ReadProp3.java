package properties;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp3 {
	public static void main(String args[]) throws IOException {
		System.out.println("******Program has been started**********");
		//property file location - using relative path ,"." indicates current working directory
		//Create instance of FileInputStream class and pass file location to its constructor
		FileInputStream fis=new FileInputStream("D:\\Acceleration\\Workspace\\XYZ_Basic_Project\\MyProp\\TextData.properties");
		//Create an instance of properties class
		Properties prop=new Properties();
		//call load method of property class to load property file
		prop.load(fis);
		//use getProperty (String key) to read specified key value for property file
		String userName=prop.getProperty("username");
		System.out.println("\n\tUsername from property file: \n\t"+userName);
		System.out.println("\n\tPassword from property file: \n\t"+prop.getProperty("password"));
		System.out.println("\n******Program has been ended*********");
	}

}
