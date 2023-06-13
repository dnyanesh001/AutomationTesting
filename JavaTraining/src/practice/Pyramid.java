package practice;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for (int i = 0; i < row; i++) {// number of line in pyramid

			for (int j = row - i; j > 1; j--) {// defines format for pyramid like spaces
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {// prints the number of symbol required in pyramid
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n\n\n\n");
		for (int i = 0; i < row; i++) {// number of line in pyramid

			for (int j = 0; j <i; j++) {// defines format for pyramid like spaces
				System.out.print(" ");
			}
			for (int k = i; k < row; k++) {// prints the number of symbol required in pyramid
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
