package day37exceptionHandling;
public class ExceptionHandling0 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//2. abnormal statements
		int[] empIds=new int[3];
		empIds[3]=101;//ArrayIndexOutOfBoundsException 
		System.out.println("Programs ends here...");
	}
}
