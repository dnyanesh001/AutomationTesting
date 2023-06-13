package day12Loops;

public class ForLoop5 {
	public static void main(String args[]) {

		/*
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello"); System.out.println("Hello");
		 * System.out.println("Hello"); 
		 * for(initialization;condition;incr/decr){  
		 * //statement or code to be executed   }  
		 */
		for (int i = 0; i < 3; ++i) {
			System.out.println("Hello i= " + i);
			for(int j=0;j<2;j++) {
				System.out.println("Bye j= "+j);
			}
		}
		
		for (int i = 0; i < 3; ++i) {
			System.out.println("Hello i= " + i);
			for(int j=0;j<2;j++) {
				System.out.println("\tHi j= "+j);
				for(int k=0;k<2;k++) {
					System.out.println("\t\tBye k= "+k);
				}
			}
		}
		
	}
}
