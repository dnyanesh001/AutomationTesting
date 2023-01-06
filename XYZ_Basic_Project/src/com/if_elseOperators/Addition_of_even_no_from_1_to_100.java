package com.if_elseOperators;

public class Addition_of_even_no_from_1_to_100 {
	public static void main(String[] args)
	{
		int i,a=100,even=0,odd=0;
		for(i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("even=\t"+even+"\nodd=\t"+odd);
	}

}
