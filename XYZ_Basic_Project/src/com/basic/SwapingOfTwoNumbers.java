package com.basic;
import Stringexamples.Example5;
class SwapingOfTwoNumbers {
	public static void main(String[] args)
	{
		Example5 c1= new Example5();
		System.out.println("program has been started");
		int Var1=23,Var2=234,Temp;
		System.out.println("The Given Vaiabes Values Are :"+"\nVariable 1=\t"+Var1+"\nVariable 2=\t"+Var2);
		Temp=Var1;
		Var1=Var2;
		Var2=Temp;
		System.out.println("The Swaping Values of a variables Are :"+"\nVariable 1=\t"+Var1+"\nVariable 2=\t"+Var2);
		System.out.println("the program of swaping operation is Sucesfull");
	}
}