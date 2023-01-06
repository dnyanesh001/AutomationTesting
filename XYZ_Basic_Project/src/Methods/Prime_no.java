package Methods;

public class Prime_no {
	static int a,count;
	public static void main(String[] args)
	{
		
		Count(17,0);
		Count();
	}
	static int Count(int a,int i)
	{
		System.out.println("the number is\t"+a);
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				System.out.print(i+" ");
			}
		}
		return(count);
	

	}
	static void Count()
	{
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("This is not prime");
		}
		System.out.println("there are "+count+ " divider of these no");
	}

}
