package com.While_Loop;

public class Reverse {
	public static void main(String[] args)
	{
		System.out.println("program for Reverse the number");
		System.out.println("Ltes start the program");
		int a=12345,rev=0,rem=0;
		while(a!=0)
		{
			rem=a%10;
			rev=10*rev+rem;
			a=a/10;
		}
		System.out.println(rev);
	}
}
