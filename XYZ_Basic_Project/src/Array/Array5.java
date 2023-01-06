package Array;
class TestReturnArray{
	//Creating method which returns an array
	static int[] getArray(){
//		int num[]=new int[3];
//		num[0]=10;
//		num[1]=13;
//		num[2]=15;
//		return num;
	return new int[] {10,30,50,90,60};	
	}
}
public class Array5 {
	public static void main(String[] args)
	{
		//calling method which returns an array 
		int arr[]=TestReturnArray.getArray();
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
}
