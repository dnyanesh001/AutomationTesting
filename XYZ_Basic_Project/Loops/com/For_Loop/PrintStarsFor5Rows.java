package com.For_Loop;

public class PrintStarsFor5Rows {
	public static void main(String[] args)
	{
		System.out.println("print 5 rows of *\n");
		int i,j;
		for(i=0;i<=5;i++)
		{
			//int stars=(i*2)-1;
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
