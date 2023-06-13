package day37exceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling14 {
	// defining a method
	public int divideNum(int m, int n)
	{
		int div = m / n;
		return div;
	}

	// main method
	public static void main(String[] args) {
		ExceptionHandling14 obj = new ExceptionHandling14();
	//	System.out.println(obj.divideNum(45, 0));
		try {
			System.out.println(obj.divideNum(45, 0));
		} catch (ArithmeticException e) {
			System.out.println("\nNumber cannot be divided by 0");
		}
		System.out.println("Rest of the code..");
	}
}