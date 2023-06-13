package practice;

import java.util.Scanner;

public class StringArrayExample {

	public static void main(String[] args) {
		
		int[] empId=new int[5];
		Scanner scn=new Scanner(System.in);
		
		for(int i=0;i<empId.length;i++) {
			System.out.println("Enter empIds: ");
			empId[i]=scn.nextInt();
		}
		for(int a:empId) {
			System.out.println(a);
		}
		
		String[] empNames=new String[3];
		for(int i=0;i<empNames.length;i++) {
			System.out.println("Enter emp names:");
			empNames[i]=scn.next();
		}
		for(String a:empNames) {
			System.out.println(a);
		}
	}

}
