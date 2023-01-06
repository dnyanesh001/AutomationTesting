package systemScannnerExamples;
import java.io.Closeable;
import java.util.Scanner;
public class ScannerExample1 {
	public static void main(String[] args)
	{
		int age=25;
		System.out.println("Age: "+age);
		/*
		 * Using Scanner Class You will be able to take input from the keyboard
		 */
		Scanner scnObj=new Scanner(System.in);
		int pin;
		double salary;
		char grade;
		boolean status;
		System.out.println(" Enter pin number: ");
		pin=scnObj.nextInt();
		System.out.println("Enter salary number: ");
		salary=scnObj.nextDouble();
		System.out.println("Enter your grade: ");
		grade=scnObj.next().charAt(0);
		System.out.println("Enter satus number ");
		status=scnObj.nextBoolean();
		System.out.println("***********************************************************************************************************");
		System.out.println(pin+"\t"+salary+"\t"+grade+"\n"+status);
		System.out.println(" Enter your name : ");
		String name=scnObj.next();
		System.out.println("Your name is : "+name );
		scnObj.close();
		
	}

}
