package com.While_Loop;

public class Armstrong_demo {
	public static void main(String[] args)
	{
		int a=154,total=0,rem;
		int temp=a;
		while(a>0)
		{
			rem=a%10;
			
			total=total+rem*rem*rem;
			/*if(total==temp)
			{
				System.out.println(total+"is armstrong");
			}*/
			a=a/10;	
		}
		if(total==temp)
		{
			System.out.println(temp+"is armstrong number");
		}
		else
		{
			System.out.println(temp+"is not a armstrong");
		}
	}

}
