package day37exceptionHandling;
import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first num1: ");
		i=scn.nextInt();
		System.out.println("Enter first num2: ");
		j=scn.nextInt();
		try{
			k= i/j;//ArithmeticException
			System.out.println("res: "+k);
		}catch(ArithmeticException obj) {
			//System.out.println("Exception handled "+obj);//java.lang.ArithmeticException: / by zero
			obj.printStackTrace();//complete exception detail
		}		
		System.out.println("Programs ends here...");
	}
}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/