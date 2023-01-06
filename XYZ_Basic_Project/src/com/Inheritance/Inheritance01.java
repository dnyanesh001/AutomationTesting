package com.Inheritance;

public class Inheritance01
{
	public static void main (String[] args)
	{
		new empoyes();
		System.out.println(empoyes.b);
		Inheritance01 object=new Inheritance01(1);
		object.BlockA();
		new Inheritance01();
		
	}
	void BlockA()
	{
		System.out.println("I am block a");
		this.BlockA(1);
		this.BlockA((byte)1);
		this.BlockA('A');
		//this.Inheritance01(1);
	}
	void BlockA(char a)
	{
		System.out.println("I am metod BlockA with char parameter");
	}
	void BlockA(byte a )
	{
		System.out.println("I am the metod BlockA having byte parameter");
	}
	void BlockA(int a)
	{
		System.out.println("I am the metod BlockA having int parameter");
	}
	Inheritance01()
	{
		System.out.println("I am Constructor of name Inheritance01 with no parameter");
		
	}
	Inheritance01(int a)
	{
		//this.Inheritance01();
		System.out.println("I am Constructor of name Inheritance01 with parameter");
	}
}
class Company
{
	char a='A';
	int Company=1;
	//System.out.println("I am Constructor of name Inheritance01 with parameter");
	{
		System.out.println("I am company class");
		System.out.println(this.Company);
	}

	
}
class empoyes extends Company
{
	char a='E';
	static char b='B';
	{
		System.out.println("I am Employ class");
	}
}
