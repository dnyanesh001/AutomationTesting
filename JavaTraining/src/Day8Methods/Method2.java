package Day8Methods;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Method2 {

	static double x = 10, y = 20, z = 30;

	// static double x,y,z;
	public static void main(String[] args) {
		// x=10;
		// y=20;
		// z=30;
		System.out.println("Input the first number: " + x);
		System.out.println("Input the second number: " + y);
		System.out.println("Input the third number: " + z);
		System.out.println("Average of 3 number is: " + average());
		System.out.println("Average of 3 number with param is: " + average(10, 25, 75));
		int a = 20, b = 30, c = 45;
		System.out.println("Average of 3 number with param is: " + average(a, b, c));
		System.out.println(addition(10, 25));
		addition(10.5, 25);
	}
	public static void addition(double a, double b) {
		System.out.println("addition method with void return type");
		double res = a + b;
		System.out.println("addition of " + a + " and " + b + " : " + res);
	}
	public static double addition(int a, int b) {
		System.out.println("addition method with double return type");
		double res = a + b;
		System.out.println("addition of " + a + " and " + b);
		return res;
	}

	public static double average(int a, int b, int c) // int a=10,int b=25,int c=75;
	// int a=p=55, b=q=58, c=r=82;
	{
		return (a + b + c) / 3;
	}

	public static double average() {
		return (x + y + z) / 3;
	}
	// Addition of two numbers
	// Multiplication of two numbers
	// division of two number
}
