package com.if_elseOperators;

public class Prime_1_to_100
{
	public static void main (String[] args)
	{		
		int i =1,j =0,prime=0;
	       
	    for (i = 1; i <= 100; i++)         
	    { 		  	  
	    	int count=0; 
	    	 //if(i%j==0)
	        //for(j=i; j>=1; j--)				
	        for(j=1;j<=i;j++)
	        {
	        	if(i%j==0)
	            { 
	        		count++;
	            }
	        }	
	        if (count==2)
	        {
	        	System.out.println(prime+i);
	        }else
	        {
	        }	
		  
	    }	
	    System.out.println("Prime numbers from 1 to 100 are :");
	}
}
	       