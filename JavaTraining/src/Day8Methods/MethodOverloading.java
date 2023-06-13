package Day8Methods;

public class MethodOverloading {
	/**
	 * Method Overloading: any method declare more than once in class body with
	 * anyone of below rules: 
	 * 1. type of argument differ or 
	 * 2. number of arguments/parameter should differ or 
	 * 3. position of arguments/parameter should differ
	 */
	static double res;
	static public void square() {
		System.out.println("No Parameter Method Called");
	}
	static public void square(int number) {
		res = number * number;
		System.out.println("Method with Integer Argument Called:" + res);
	}
	static public void square(double number) {
		res = number * number;
		System.out.println("Method with double Argument Called:" + res);
	}
	public static void main(String[] args) {		
		MethodOverloading.square(2.5f);
		MethodOverloading.square();
		MethodOverloading.square(5);
	}
}