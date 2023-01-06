package com.Day11Operators;

public class IncrementDecrement1
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the world of the increments and decrement operators");
		int a=0,b=a;
		System.out.println("a=\t"+a+"\nb=\ta");
		b=a++ + ++a + a++ + a++;
		System.out.println("b=a++ + ++a + a++ + a++;");
		System.out.println("b=\t"+b);
		System.out.println("a=\t"+a);
		int C=b;
		C=b++ + b++;
		System.out.println("C=b++ + b++;");
		System.out.println("C=\t"+C);
		System.out.println("b=\t"+b);
		int k,l;
		l=a-- + a++;
		System.out.println("l=a-- + a++;");
		k=C++ + ++b + a++;
		System.out.println("k=C++ + ++b + a++;");
		System.out.println("k=\t"+k);
		System.out.println("b=\t"+b);
		System.out.println("C=\t"+C);
		System.out.println("a=\t"+a);
		System.out.println("l=\t"+l);
		System.out.println("We are going to decrement operation\nlets start it");
		int x=10,y=x,z=x;
		y=x-- - --x + z-- - x--;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
