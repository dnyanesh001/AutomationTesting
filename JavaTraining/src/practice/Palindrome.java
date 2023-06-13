package practice;

public class Palindrome {
	
	/**
	 * num1=12345; reverse=54321
	 * 	rem=num1%10
	 *	rev=rev*10+rem
	 *	num1=num1/10;
	 * 
	 * palindrome: num1=121; reverse=121
	 */
	static void reverseNumber(int num) {
		int rev=0;
		System.out.println("Actual Number: "+num);
//		while(num!=0) {
//			int rem=num%10;
//			rev=rev*10+rem;
//			num=num/10;
//		}
		for(;num!=0;num=num/10) {
			int rem=num%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse Number: "+rev);
	}
	
	static void palinNumber(int num) {
		int rev=0,temp=num;
		System.out.println("Actual Number: "+num);
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Given number is palindrome");
		}else{
		System.out.println("Given number is not a palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Palindrome.reverseNumber(123);
		Palindrome.palinNumber(121);
	}
}
