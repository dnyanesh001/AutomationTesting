package systemScannnerExamples;
import java.util.Scanner;

public class ScannerClassExample1 {
	public static void main(String args[])
	{
		String s="Hello, This is BasicJava.";
		//Create scanner Object and pass string in it
		Scanner input=new Scanner(s);
		//Check if the scanner has a token 
		System.out.println("Boolean Result: "+input.hasNext());
		//print the string
		System.out.println("String: "+input.nextLine());
		input.close();
		System.out.println("---------Enter Your Details--------");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=in.next();
		System.out.println("Name: "+name);
		System.out.print("Enter your age: ");
		int i=in.nextInt();
		System.out.print("Age: "+i);
		System.out.println("Enter your salary: ");
		double d=in.nextDouble();
		System.out.println("Salaary: "+d);
		in.close();
		
	}

}
