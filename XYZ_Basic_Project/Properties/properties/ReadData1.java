package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData1 {
	public static void main(String args[]) throws IOException {
		//property file location 
		String fileLocation="D:\\Acceleration\\Workspace\\XYZ_Basic_Project\\MyProp\\TextData.properties";
		//Create instance of FileInputStream class and pass file location to its constructor
		FileInputStream fis=new FileInputStream(fileLocation);
		//Create an instance of propertiesClass class
		Properties Prop=new Properties();
		//Call load method of property class to load property file
		Prop.load(fis);
		//use getProperty(String key) to read specified key value for property file
		String Username=Prop.getProperty("username");
		System.out.println("Username from property file: "+Username);
		System.out.println("Password from property file: "+Prop.getProperty("password"));
		System.out.println("Password1 from property file: "+Prop.getProperty("password1"));
	}

}
