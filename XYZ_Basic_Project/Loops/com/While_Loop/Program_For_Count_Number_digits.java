package com.While_Loop;

public class Program_For_Count_Number_digits{
	public static void main(String[] args)
	{
		System.out.println("Program for count number of digits in Number");
		int a=124,count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
	}

}
