package systemscannerexamples;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter required number:");
		int num=sc.nextInt();
		cube(num);
	}
	
	static void cube(int num) {
		int res=num*num*num;
		System.out.println("Cube is : "+res);
	}

}
