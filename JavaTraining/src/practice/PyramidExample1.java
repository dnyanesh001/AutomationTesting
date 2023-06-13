package practice;

public class PyramidExample1 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {//number of rows in pyramid
			for(int j=0;j<=i;j++) {//pattern in pyramid
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {//number of rows in pyramid
			for(int j=0;j<=i;j++) {//pattern in pyramid
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {//number of rows in pyramid
			for(int j=0;j<=i;j++) {//pattern in pyramid
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
