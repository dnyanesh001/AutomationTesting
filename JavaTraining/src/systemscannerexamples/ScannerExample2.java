package systemscannerexamples;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnObj=new Scanner(System.in);
		System.out.println("Enter your address: ");
		String address=scnObj.nextLine();
		System.out.println("My address is: "+address);
	}
}
