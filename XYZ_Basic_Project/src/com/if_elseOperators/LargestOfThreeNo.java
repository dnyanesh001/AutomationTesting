/**Find Largest Among three numbers using if..else statement*/
package com.if_elseOperators;

public class LargestOfThreeNo {
	public static void main(String[] args)
	{
		System.out.println("Welcome to the world of largest no");
		int a=35,b=36,c=23;
		System.out.println("a=\t"+a+"\nb=\t"+b+"\nc=\t"+c);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("The largest no is a\t"+a);
			}
			else
			{
				System.out.println("the largest is c\t"+c);
			}
		}
		else if(b>c)
		{
			System.out.println("The lagest no is b\t"+b);
		}
		else
		{
			System.out.println("The lagest no is c\t"+c);
		}
	}
}
		