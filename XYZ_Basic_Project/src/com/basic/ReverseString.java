package com.basic;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	      String string = "abcdef";
	      UsingArray(string);
	      System.out.println();
	      Scanner str1=new Scanner(System.in);
	      String str=str1.nextLine();
	      ReverseStringLine(str);
	}
	static void UsingRevese(String Str) {
	      String reverse = new StringBuffer(Str).reverse().toString();
	      System.out.println("\nString before reverse: "+Str);
	      System.out.println("String after reverse: "+reverse);
	   }
	static void UsingArray(String Str)
	{
		char[] CHAR = Str.toCharArray();
	    for (int i = CHAR.length-1;i >= 0; i--)
	    	System.out.print(CHAR[i]);
	}
	public static void ReverseStringLine(String str) {
		str=str+" ";
		String StrArray[]= str.split(" ");	
		System.out.println("Original String is:\t"+str);
		System.out.print("Reverse String is:\t");
		for(int i=StrArray.length-1;i>=0;i--)
		{
			System.out.print(StrArray[i]+" ");
		}
	}

}
