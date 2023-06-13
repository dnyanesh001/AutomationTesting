package day11Operators;

public class Logicalop3 {
	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1=-5,num2=0;
		
		// Logical AND
		System.out.println("bool1 && bool2 = " + ((num1==num2) && (num1>num2)));//

		// Logical OR
		System.out.println("bool1 || bool2 = " + ((num1==num2) || (num1>num2))); // 

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !((num1==num2) && (num1>num2)));//

	}
}