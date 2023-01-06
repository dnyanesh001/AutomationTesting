package com.While_Loop;

public class prime_numbers {
	public static void main(String[] args)
	{
		for(int j=2;j<=100;j++)
		{
			int i,count;

			if(j==1)
			{
				System.out.println("1 is not prime");
			}
			else {
				for(i=1,count=0;i<=j;i++)
				{
					
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println("the number is prime"+j);
				}
			}
		}
	}

}
