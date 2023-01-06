package Stringexamples;

public class Example9 {
	public static void main(String[] args) {
		String s2="1234";
		System.out.println("s2 : "+s2);
		//int sum=s2+100;//compile time error , because we cant store String into int
		// if String object contains int value, dn before using it for any arithematic operation first convert it into int 
		int num=Integer.parseInt(s2);
		int sum=num+100;
		System.out.println("Result: "+sum);
	}

}
