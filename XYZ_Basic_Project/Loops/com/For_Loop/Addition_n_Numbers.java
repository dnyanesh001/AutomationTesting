package com.For_Loop;

public class Addition_n_Numbers {
	public static void main(String[] args)
	{
		int fact=0,a=7;
		for(int i=1;i<=a;i++)
		{
			fact=fact+i;
			System.out.print(i+"+");
		}
		
		System.out.println("\n="+fact);
	}

}
