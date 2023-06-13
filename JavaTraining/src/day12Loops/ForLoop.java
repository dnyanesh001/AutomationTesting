package day12Loops;

public class ForLoop {
	public static void main(String args[]) {

//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
//		System.out.println("Hello Everyone, Good Morning...");
		/*
		 * for(initialization;condition;increment/decrement){
		 * //statement or code to be executed   }  
		 */
		for(int i=1;i<6;i++) {
			System.out.println("Hello Everyone, Good Morning...");
		}
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("*************Reverse****************");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		//A=65, a=97
		System.out.println("******************************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1+" ");
		}
		System.out.println("\n******************************");
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1+" ");
		}
		System.out.println("\n******************************");
	 	for(char c1='z';c1>='a';c1--) {
	 		System.out.print(c1+" ");
	 	}
	}
}
