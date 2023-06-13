package Samples;

public class Example2 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {//number of lines in pyramid
			for(int j=0;j<=5;j++) {//formating 
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {//pattern
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
