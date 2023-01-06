package com.if_elseOperators;

public class prime_No
{
	public static void main(String[] args)
	{
		int a=11,i,count=0;
			for(i=2;i<a;i++)
			{
				if(a%i==0)
				{
					count++;
					System.out.println(i);
				}
			}
			if(count==0)
			{
				System.out.println("this is prime number");
			}
				
	}

}
