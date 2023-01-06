/**Check if a Number is Positive or Negative using if else */
package com.if_elseOperators;

public class Positive_negative {
	public static void main(String[] args)
	{
		System.out.println("Welcome the world of the number");
		System.out.println("lets set the number");
		int a=23;
		System.out.println("The number is=\t"+a);
		if(a>0)
		{
			System.out.println("The give number is positive");
		}
		else if(a<0)
		{
			System.out.println("the given number is negative");
		}
		else
		{
			System.out.println("The given no is Zero[Null]");
		}
	}

}
