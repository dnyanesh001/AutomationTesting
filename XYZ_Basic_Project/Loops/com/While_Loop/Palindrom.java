package com.While_Loop;

public class Palindrom {
	public static void main(String[] args)
	{
		System.out.println("Program to check number is palindrom or not ");
		int a=12344321,rev=0;
		System.out.println("given number is "+a);
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("reverse no is "+rev);
		if(a==rev)
		{
			System.out.println("This number is palindrom");
		}
		else
		{
			System.out.println("This number is not a palindrom");
		}
	}

}
