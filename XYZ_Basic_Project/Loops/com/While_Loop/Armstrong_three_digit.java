package com.While_Loop;
//Check Armstrong Number for 3 digit number
public class Armstrong_three_digit {
	public static void main(String[] args)
	{
		System.out.println("write the program for the armstrong no");
		int temp,a,rem,i=100;		while(i<1000)
		{
			temp=i;
			a=temp;
			int total=0;
			while(a>0)
			{
				rem=a%10;
				total=(rem*rem*rem)+total;
				/*if(total==temp)
				{
					System.out.println(total+"is armstrong");
				}*/
				a=a/10;	
				//temp--;//407=(4*4*4)+(0*0*0)+(7*7*7)
			}
			if(total==temp)
			{
				System.out.println(total+"is armstrong");
			}
			i++;
		}
	}

}
