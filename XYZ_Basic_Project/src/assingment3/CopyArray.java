package assingment3;

public class CopyArray {
	public static void main(String[] args) {
	int a[]= {10,28,24,34,21};
	System.out.println("original");
	for(int i:a)
	{
		System.out.println(i);
	}
	int b[]=a;
	System.out.println("duplicate");
	for(int i:b)
	{
		System.out.println(i);
	}
}

}



