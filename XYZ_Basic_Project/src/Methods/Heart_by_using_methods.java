package Methods;

public class Heart_by_using_methods {
	public int piramid(int i,int j,int space)
	{
		int lim=5;
		for(i=lim;i>=1;i--)
		{
			if(i%2!=0)
			{
			for(space=1;space<=(5-i);space++)
			{
				System.out.print(" ");
			}
				for(j=1;j<=(i*2-1);j++)
				{
					//System.out.print("*");
					System.out.print("*");
				}
				System.out.println();
			}
		}
		return(1);
	}
	public static void row1(int b)
	{
		for(int i=1;i<=9;i++)
		{
			if(i==1)
			{
				System.out.print(" ");
			}
			else if(i>1&&i<=4)
			{
				System.out.print("*");
			}
			else if(i==5)
			{
				System.out.print(" ");
			}else if(i<=8)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	public static int row1(short a)
	{
		for(int i=1;i<=9;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		return(1);
	}
	public static void main(String[] args)
	{
		Heart_by_using_methods obj=new Heart_by_using_methods();
		row1(1);
		row1((short)1);
		obj.piramid(1,1,1);
	}

}
