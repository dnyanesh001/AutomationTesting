package assingment3;

import java.util.Arrays;

public class Array{
	public static void main(String[] args) {
		int a[]= {1,2,3,2,4,2,3,1,4},b[] ={23,12,45,56,24};
		FrequencyArray(a);
	}
	public static void FrequencyArray(int a[]) {
        int [] fr = new int [a.length];  
        int visited = -1;  
        for(int i = 0; i < a.length; i++){  
            int count = 1;  
            for(int j = i+1; j < a.length; j++){  
                if(a[i] == a[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        System.out.println(" Element | Frequency");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println(a[i] + "\t|\t" + fr[i]);  
        }  
	}
	public static void reverseArray(int a[]){
		System.out.println("original");
		for(int i:a)
		{
			System.out.println(i);
		}
		int b=(a.length)-1;
		System.out.println("reverse");
		for (int i:a)
		{
			System.out.println(a[b]);
			b--;
		}
	}
	public static void coppyArray(int[] a) {
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
	public static void swapingArray(int a[])
	{
		System.out.println("Swaping an array members");
		int temp=a[1];
		a[1]=a[2];
		a[2]=temp;
		System.out.println("a[1]="+a[1]+"\na[2]"+a[2]);
	}
	public static void AccendingArray(int a[])
	{
		
		int j;
		System.out.println("\n\n\nprogram for accending order");
		for(int i=0;i<(a.length+1);i++)
		{
			for(j=0;j<(a.length-i)-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp1=a[j];
					a[j]=a[j+1];
					a[j+1]=temp1;
				}

			}
		}
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	public static void DecendingArray(int a[])
	{
		int j;
		System.out.println("\n\n\nprogram for decending order");
		for(int i=0;i<(a.length+1);i++)
		{
			for(j=0;j<(a.length-i)-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp1=a[j];
					a[j]=a[j+1];
					a[j+1]=temp1;
				}

			}
		}
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	public static void PrintArrray(int a[])
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	public static void EvenArray(int a[])
	{
		for(int i:a)
		{
			if(i%2==0)
				System.out.println(i);
		}
		
	}
	public static void OddArray(int a[])
	{
		for(int i:a)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
	public static void Largest(int a[])
	{
		int j;
		for(j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp1=a[j];
				a[j]=a[j+1];
				a[j+1]=temp1;
			}

		}
		System.out.println(a[j]);
	}
	public static void Smallest(int a[])
	{
		int j;
		for(j=0;j<a.length-1;j++)
		{
			if(a[j]<a[j+1])
			{
				int temp1=a[j];
				a[j]=a[j+1];
				a[j+1]=temp1;
			}

		}
		System.out.println(a[j]);
	}
	public static void ArrayLength(int a[])
	{
		System.out.println(a.length);
	}
	public static void ArraySum(int a[])
	{
		int sum=0;
		for(int i:a)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void largest3rd(int a[]) {
		Arrays.sort(a);
		System.out.println(a[a.length-3]);
		
	}
	public static void largest2nd(int a[]) {
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
		
	}
	public static void Smallest2(int a[]) {
		Arrays.sort(a);
		System.out.println(a[1]);
	}
	public static void RemoveDuplicate(int a[]) {
		System.out.println("original array");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		Arrays.sort(a);
		int temp[]=new int [(a.length)];
		int j=0,k=0;
		for(int i=1;i<a.length;i++,k++)
		{
			if(a[i]!=a[k])
			{
				temp[j]=a[k];
				j++;
			}
		}
		temp[j]=a[k];
		System.out.println("\n\nafter removing the dupicates");
		for(int i:temp)
		{
			System.out.println(i);
		}
		
	}
}