package com.Day11Operators;

public class Test {
	static int fun(int n)
	{
		int result;
		result=fun(n-1);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome"+fun(1));
		
	}

}
