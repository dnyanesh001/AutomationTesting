package systemScannnerExamples;
import java.util.Scanner;
public class ScannerExample2 {
	public static void main(String[]args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Your address: ");
		String address=scan.next();
		System.out.println("My address is: "+address);
		scan.close();
		
	}

}
