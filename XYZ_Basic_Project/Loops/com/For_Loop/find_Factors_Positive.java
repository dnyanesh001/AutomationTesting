package com.For_Loop;

public class find_Factors_Positive {
	public static void main(String[] args)
	{
		int a=23;
		System.out.println("the given no is \t"+a);
		System.out.println("The Factors of number "+a+" is ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
