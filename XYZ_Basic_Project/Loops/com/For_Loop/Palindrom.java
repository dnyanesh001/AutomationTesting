package com.For_Loop;

public class Palindrom {
	public static void main(String[] args)
	{
		int a=1234321,rev=0,rem=0;
		System.out.println(a+"the given number");
		int temp=a;
		for(;a>0;)
		{
			rem=a%10;
			rev=10*rev+rem;
			a=a/10;
		}
		System.out.println(rev+"the number in reverse manner");
		a=temp;
		if(a==rev)
			System.out.println("The numver is palindrom");
		else
			System.out.println("this number is not a palindrom");
	}

}
