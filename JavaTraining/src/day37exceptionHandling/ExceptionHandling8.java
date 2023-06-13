package day37exceptionHandling;

//unhandled exception in program
public class ExceptionHandling8 {
	public static void main(String args[]) {
		try {
			System.out.println("Inside the try block");
			// below code throws divide by zero exception
			int data = 25 / 5;
			//System.exit(0);
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("I am inside finally block");
			int k=10/0;
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
/*
error vs exception
checked vs unchecked exception
can we declare multiple catch block for a single try block?
can try handle more dn one exception at a time?
what is unreachable code/block?
what will you do, if you are not sure about exception coming from try block?
*/