package Methods;
class demo
{
	static int sum=25;
}

public class Method01 
{
	
	
	public static void main(String[] args)
	{
		Method01 obj1=new Method01();
		obj1.Statement();
		obj1.Statement();
		obj1.Statement();
		obj1.Statement();
		obj1.Statement();
		System.out.println("*******Next********");
		Method01.addition(12,23);
		System.out.println(demo.sum);
		System.out.println("*****Next*****");
		System.out.println(addition(23,34));
		addition(23,43);
	}
	void Statement()
	{
		System.out.println("Welcome to jalgaon");
	}
	public static int addition(int a,int b)
	{
		int sum=a+b;
		System.out.println(a+"+"+b+"="+sum);
		return(sum);
	}
	public static double addition(int c,float d)
	{
		double add=c+d;
		System.out.println(c+"+"+d+"="+add);
		return(add);
	}

}
