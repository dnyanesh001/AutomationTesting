package Samples;

public class FullPyramid {

	public static void main(String[] args) {
		//for1 ---> number rows
			//for2 ---> design 
			//for3 ---> pattern to be printed
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/**
Debug: means executing program line by line
1. add break point in to the required line
2. dn use following keys
	f6- execute current line move control to next line
	f5- if you have any method call and you want to go inside the method dn use F5
	f8- continue the flow
	ctrl+shift+i: if you want to see the return value of a method or value of a variable then use this
*/