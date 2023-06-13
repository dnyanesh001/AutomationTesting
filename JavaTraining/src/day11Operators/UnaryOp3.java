package day11Operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
		System.out.println("a: "+a);// 3
		System.out.println("b: "+b);// 8
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
	 
		System.out.println("a: "+a);//  -8
		System.out.println("b: "+b);//  -28

		a = 21;
		b = --a + --a + --a + a + ++a + a++;
			
		System.out.println(a);// 20
		System.out.println(b);// 113

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;

		System.out.println(a);// 1
		System.out.println(b);// -8
	}
}
