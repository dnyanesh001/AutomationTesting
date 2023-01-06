package properties1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData1 {
	public static void main(String []args) throws IOException {
	//property file location
		String filelocation="D:\\Acceleration\\Workspace\\XYZ_Basic_Project\\MyProp\\TextData.properties";
		//Create Instance of FileInputStream Class and pass filelocation as parameter to constructor
		FileInputStream fis=new FileInputStream(filelocation);
		//Create Instance of Properties Class
		Properties prop=new Properties();
		//call load method of propeties class to load properties class
		prop.load(fis);
		//use getProperty(String Property);to read specified key values of properties file
		String UserName=prop.getProperty("username");
		System.out.println("Properties from property file: "+UserName);
	}
}
