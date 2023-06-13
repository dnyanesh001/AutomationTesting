package day37exceptionHandling;
public class ExceptionHandling00 {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//4. abnormal statements
		String s="abc";  
		int num=Integer.parseInt(s);//NumberFormatException  
		System.out.println("num: "+num);
		System.out.println("Programs ends here...");
	}
}
