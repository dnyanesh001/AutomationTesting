package com.For_Loop;

public class PrintingStarsFor5Rows2 {
	public static void main(String[] args)
	{
		System.out.println("print5 row of Stars");
		int i,j,space;
		for(i=5;i>=1;i--)
		{
			System.out.print("\n");
			for(space=1;space<=(5-i);space++)
			{
				System.out.print(" ");
			}
				for(j=1;j<=(i*2-1);j++)
				{
					System.out.print("*");
				}
		}
	}
}
/*  output  
    *
   ***
  *****
 *******
*********/