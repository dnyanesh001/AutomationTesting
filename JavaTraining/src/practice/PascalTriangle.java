package practice;

public class PascalTriangle {
	
	static void pascelTriangle(int r,int cl) {
		for(int i=0;i<r;i++) {//row
			for(int j=1;j<r-i;++j) {//spaces for pattern formation
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				if(j==0||i==0) {
					cl=1;
				}else {
					cl=cl*(i-j+1)/j;
				}
				System.out.print(" "+cl);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		PascalTriangle.pascelTriangle(5,1);

	}

}
