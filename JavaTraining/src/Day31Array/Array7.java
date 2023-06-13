package Day31Array;

import java.util.Arrays;

public class Array7 {
	public static void main(String args[]) {
		int[] num1= {5,2,55,80,100,20,3};
		for(int a:num1) {
			System.out.println(a);
		}
		System.out.println("***********CopyOf array*******************");
		int num2[]=Arrays.copyOf(num1, 7);
		for(int num:num2) {
			System.out.println(num);
		}
		System.out.println("*************CopyRange array***************");
		int[] num3=Arrays.copyOfRange(num1, 0, 5);
		for(int a:num3){
			System.out.println(a);
		}
		System.out.println("****************Compare two array************************");
		//equals() compares two array with exact match -->true/false
		System.out.println("is num1 and num2 are same? "+Arrays.equals(num1, num2));
		System.out.println("is num1 and num3 are same? "+Arrays.equals(num1, num3));
		System.out.println("***************After sorting compare num1 & num2*******************");
		Arrays.sort(num2);
		System.out.println("is num1 and num2 are same? "+Arrays.equals(num1, num2));
	}
}
