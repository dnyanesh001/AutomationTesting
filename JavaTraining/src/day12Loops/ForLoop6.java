package day12Loops;

public class ForLoop6 {
	public static void main(String args[]) {

		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
