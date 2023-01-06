package com.For_Loop;

public class Find_Factors_negativeNumber {
	public static void main(String[] args)
	{
		System.out.println("Find the factor of negative numbers");
		int a=-12;
		if(a==0)
		{
			System.out.println("Your number is = "+a+"\tplease enter valid number");
		}
		else if(a<0)
		{
			System.out.println(a+"\t is negative number"+"\tfactors of this numbers is");
			for(int i=-1;i>=a;i--)
			{
				if(a%i==0)
			{
				System.out.println(i+"\t&\t"+(i*-1));
			}
			}
		}
		else
		{
			System.out.println(a+"is positive number"+"factors of thos numbers is");
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					System.out.println(i+"\t&\t"+(i*-1));
				}
			}
		}
	}

}
