package systemScannnerExamples;

public class SystemArrayCopyExample1 {
	public static void main(String []args)
	{
		String a[]= {"A","B","C","B","A","H"}; //Source Array
		String b[]={"S", "H", "U", "N", "U", "L", "L", "J", "A", "D", "O", "N" };//destination array
		String src[],dest[];
		int Pos,destPos,length;
		src=a;
		Pos=2;
		dest=b;
		destPos=3;
		length=4;
		System.out.println("source array: ");
		for(int i=0; i<src.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nDestination Array: ");
		for(int i=0;i<dest.length;i++) {
			System.out.print(b[i]+"\t");
		}
		System.out.println("\nSource position: "+Pos);
		System.out.println("Destination Positon:" + destPos);
		System.out.println("Length: "+length);
		System.arraycopy(src,Pos,dest,destPos,length);//Use of arraycopy() method
		System.out.println("Destinaton array after use of arraycopy()");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}

}
