package com.While_Loop;

public class Armstrong_100To999 {
	public static void main(String[] args)
	{
		for(int i=100;i<=1000;i++)
		{
		int a=i,total=0,rem;
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
		/*else
		{
			System.out.println(temp+"is not a armstrong");
		}*/
		}
	}


}
