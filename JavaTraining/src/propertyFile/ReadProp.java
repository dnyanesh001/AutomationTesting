package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// property file location- using absolute path
		String fileLocation = "F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJavaSessions\\JavaTraining\\MyProp\\TestData.properties";
		// Create instance of FileInputStream class and pass file location to its
		// constructor
		FileInputStream fis = new FileInputStream(fileLocation);
		// create an instance of Properties class
		Properties prop = new Properties();
		// call load method of property class to load property file
		prop.load(fis);
		// use getProperty(String key) to read specified key value for property file
		String userName = prop.getProperty("username");
		System.out.println("Username from property file: " + userName);
		System.out.println("Password from property file: " + prop.getProperty("password"));
		System.out.println("Password1 from property file: " + prop.getProperty("password1"));
	}
}
