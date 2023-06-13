package day12Loops;

public class WhileLoop2 {

	public static void main(String args[]) {
		int i = 4;
		System.out.println("Printing numbers from 4 to 0");
		while (i >= 0) {
			System.out.println("Hello " + i);
			i--;
		}
		/**
		 * Output:	
		 * 			Hello 4
		 * 			Hello 3
		 * 			Hello 2
		 * 			Hello 1
		 * 			Hello 0
		 */

		char c1 = 'a';
		while (c1 <= 'z') {
			System.out.print(c1 + " ");
			c1++;
		}
		/**
		 * Output: 
		 * 		a b c d ....... z
		 */
		
		System.out.println("\n***Reverse***");
		char c2 = 'z';
		while (c2 >= 'a') {
			System.out.print(c2 + " ");
			c2--;
		}
		/**
		 * Output:	
		 * 			z y x ... a
		 */
		System.out.println();
		int num=1;
		while(num<=50) {
			if(num%2==0) {
			System.out.println("Even number is: "+num);
			}
			num++;
		}
	}
}
