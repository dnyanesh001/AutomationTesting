package Array;

public class Array3 {
	public static void main(String[] args) {
		int[] numbers= { 2,-4,-2, 8,17, 9,-9,12}	;			
		double sum=0;
		double average;
		//access all element using for each loop add each element in sum
		for(int n:numbers)
		{
			//sum=sum+n;
			sum+=n;
		}
		average=sum/(numbers.length);
		System.out.println("sum ="+sum);
		System.out.println("average="+average);
	}
}
