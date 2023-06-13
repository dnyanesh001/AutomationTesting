package Day31Array;

class M_Array3 {
	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		// declaring a destination array
		char[] copyTo = new char[7];
		// copying array using System.arraycopy() method
						//src, indextocopy, dest, indextostart,indextoend
		System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.println(copyTo[i]);
		}
	}
}
