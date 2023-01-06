package Array;

public class Array1 {
	public static void main (String[] args)
	{
		System.out.println("Program has been started");
		/*
		// declaration
		* int a[];
		//size initializaton
		* a=new int[5]; 
		*/
		int a[]=new int[5];//declaration and initialization
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]+"\n\n\n");
		System.out.println("***-intialising the values-***");
		a[0]=10;
		a[1]=20;
		a[2]=50;
		a[3]=60;
		a[4]=70;
		System.out.println("******After intialization********");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]+"\n\n\n");
		System.out.println("Array elements count:"+a.length);
		System.out.println("*****normal for loop");
		//traversing array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("\n*****for-each loop******");
		/**
		 * LHS should be same as RHS type in form of datatype or class
		 * for(LHS : RHS)
		 * {
		 * }
		 */
		for(int num:a)
		{
			System.out.println(num);
		}
		char[] getArray=new char [4];
		getArray[0]='A';
		getArray[1]='B';
		getArray[2]='C';
		getArray[3]='D';
		//or
		char[] getArray2= {'A','B','C','D'};
		char[] getArray3=new char[] {'a','b','c','d'};
		System.out.println("******for-each*******");
		for(char num:getArray3)
		{
			System.out.println(num);
		}
		System.out.println("****for-each2*****");
		for(char num:getArray2)
		{
			System.out.println(num);
		}
		System.out.println("Program has been ended");
	}

}

