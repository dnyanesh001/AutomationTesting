package com.For_Loop;
public class State_Prime_Else_Show_factors {
	public static void main(String[] args)
	{
		int a=87,count=0;
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
			System.out.println("door closed");
		}
		else
		{
			System.out.println("This is not prime");
		}
	}	

}