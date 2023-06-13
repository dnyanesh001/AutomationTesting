package Samples;

public class Example1 {

	public static void main(String[] args) {
		
//		for(char c1='A';c1<='Z';c1++) {
//			int temp=c1;
//			System.out.println(c1+" : "+temp);
//		}
		System.out.println(addTwoNumber(25, 65));
		System.out.println(multiplyTwoNumber(25.5, 10.20));
		System.out.println(getASCIValue('z'));
		printQuatientAndRemainder(25, 6);
		
		swapTwoNumbers(25, 10);
	}
	static void swapTwoNumbers(int num1,int num2) {
		System.out.println("Initial num1 is: "+num1);
		System.out.println("Initial num2 is: "+num2);
		int temp=num1+num2;//35
		num1=temp-num1;//num1=35-25=10
		num2=temp-num1;//num2=35-10=25
		System.out.println("***********After swapping*************");
		System.out.println("num1 is: "+num1);
		System.out.println("num2 is: "+num2);
	}
	static void printQuatientAndRemainder(int num1,int num2) {
		int rem=num1%num2;
		int q=num1/num2;
		System.out.println("Remainder is: "+rem);
		System.out.println("Quatient is: "+q);
	}
	
	static int getASCIValue(char c1) {
		return c1;
	}
	static int addTwoNumber(int num1,int num2) {
		int res=num1+num2;
		return res;
	}
	
	static double multiplyTwoNumber(double num1,double num2) {
		return num1*num2;
	}
}
