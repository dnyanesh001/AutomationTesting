package Methods;

public class printing_the_Piramid_of_stars {
	static int i,space,j;
	public static void main(String[] args)
	{
		for(i=1;i<=5;i++)
		{
			System.out.println();
			printing_the_Piramid_of_stars.space();
			printing_the_Piramid_of_stars.stars();
			
		}
		
	}
	public static void space()
	{
		for(space=1;space<=(5-i);space++)
		{
			System.out.print(" ");
		}
	}
	public static void stars()
	{
		j=1;
		do
		{
			if(j==1)
			{
				System.out.print("*");
			}else if(j<=(i*2-2))
			{
				System.out.print(" ");
			} if(j==(i*2-2))
			{
				System.out.print("*");
			}
			j++;
		}
		while(j<=(i*2-2));
	}

}
