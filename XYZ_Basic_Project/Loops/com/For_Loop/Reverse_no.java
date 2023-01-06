package com.For_Loop;

public class Reverse_no {
	public static void main(String[] args)
	{
		int a=123,i=0;
		int temp=a;
		for(i=0;a>0;i++)
		{
			a=a/10;			
		}
		System.out.println(i);
		a=temp;
		for(int j=0;j<i;j++)
		{
			if(a<10)
			{
				System.out.print(a);
			}
			else
			{
				System.out.print(a%10);
				a=a/10;
			}
		}
	}
}
