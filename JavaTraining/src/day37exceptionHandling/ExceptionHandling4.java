package day37exceptionHandling;
public class ExceptionHandling4 {
	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;//
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		try {
			int a[] = new int[5];
			a[5] = 30 / 2;//
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
/**
* try block can have multiple catch block, but only one catch block will be executed 
* try can handle only one abnormal condition at a time
*/