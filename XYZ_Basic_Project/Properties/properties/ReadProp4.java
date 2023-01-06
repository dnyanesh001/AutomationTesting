package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadProp4 {
	public static void main(String args[]) throws IOException  {
		//property file location - using System class, "." indicates current working directory
		String fileLocation=System.getProperty("user.dir")+"\\MyProp\\TestData.properties";
		FileInputStream fis=new FileInputStream(fileLocation);
		Properties prop=new Properties();
		prop.load(fis);
		String Username=prop.getProperty("username");
		System.out.println("Username from property file is: "+Username);
		System.out.println("password from property file is: "+prop.getProperty("password"));
		System.out.println("Email id form property file is: "+prop.getProperty("emailId"));
		System.out.println("Mobile no from property file is: "+prop.getProperty("mobile"));
		
	}
}
