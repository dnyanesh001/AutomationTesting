package day13Constructor;

public class MethodOverloading2 {
	/* fix the error in */

	double sum(int g, int h) {
		System.out.println(g + h);
		return (g + h);
	}

	double sum(int g, double h) {
		System.out.println(g + h);
		return (g + h);
	}

	public static void main(String args[]) {
		MethodOverloading2 ob = new MethodOverloading2();
		double result = ob.sum(20, 20);
		double result2 = ob.sum(20, 20.56);

	}
}