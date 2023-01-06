package Array;

public class Array2 {
	public static void main(String args[])
	{
		//create an array 
		int[] age= {12,23,34,25,56};
		//access each element elements
		System.out.println("Accessing Element of Array");
		System.out.println("First Element"+age[0]);
		System.out.println("Second Element"+age[1]);
		System.out.println("third Element"+age[2]);
		System.out.println("Fourth Element"+age[3]);
		System.out.println("Fifith Element"+age[4]);
		System.out.println("******Ussing fo loopr*******");
		for(int i=0;i<age.length;i++)
		{
			if(age[i]==25)
			{
				System.out.println(age[i]);
				break;
			}else
			{
				System.out.println("age is not 25");
			}
		}
		System.out.println("********using for each Loop********");
		for(int a: age)
		{
			if(a==25)
			{
				System.out.println(a);
				break;
			}else
			{
				System.out.println("age is not 25");
			}
		}
	}

}
