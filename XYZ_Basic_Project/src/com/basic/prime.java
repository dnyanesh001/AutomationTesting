package com.basic;

import java.util.Scanner;

public class prime {
	public static void main(String[] args)
	{
		int count=0;
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("the number is\t"+a);
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				System.out.print(i+" ");
			}
		}
		if(count%2==0)
		{
			System.out.println("it is prime no.");
		}
		else
		{
			System.out.println("This is not prime");
		}
	}	

}
