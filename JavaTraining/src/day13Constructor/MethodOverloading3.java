package day13Constructor;

public class MethodOverloading3 {

	public void Square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}

	public void Square(double number) {
		double square = number * number;
		System.out.println("Method with double Argument Called:" + square);
	}

	public void Square(long number) {
		long square = number * number;
		System.out.println("Method with long Argument Called:" + square);
	}

	public static void main(String[] args) {
		
		MethodOverloading3 m1=new MethodOverloading3();
		m1.Square(12.34);
		m1.Square(12);
		m1.Square(123l);
	}

}
