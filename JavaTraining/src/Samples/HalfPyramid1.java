package Samples;

public class HalfPyramid1 {

	public static void main(String[] args) {
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
		
		for(char i='a';i<'f';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(char i='a';i<'f';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
