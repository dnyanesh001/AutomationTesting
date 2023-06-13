package day37exceptionHandling;
public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i = 10;
		int j = i/0;//ArithmeticException
		System.out.println("res: "+j);
		System.out.println("Programs ends here...");
	}
}
