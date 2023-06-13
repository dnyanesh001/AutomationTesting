package day13Constructor;

class Multiply {
	
	Multiply(){
		System.out.println("Zero-para cons..");
	}
	void mul(int a, int b) {
		System.out.println("Sum of two=" + (a * b));
	}

	void mul(int a, int b, int c) {
		System.out.println("Sum of three=" + (a * b * c));
	}
}
public class MethodOverloading1 {
	public static void main(String args[]) {
		Multiply m = new Multiply();
		m.mul(6, 10);
		m.mul(10, 6, 5);
	}
}

/**
 * Method Overloading: a class having same method more than once
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */