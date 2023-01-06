package Methods;

public class Method0 {
	static void addTwoNum(int a,int b)
	{
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
		
	}
	public static void main(String[] args)
	{
		addTwoNum(10,20);
		addTwoNum(100,200);
		Method0.addTwoNum(101,202);
		Method0.addTwoNum(123, 210);
		Method0.addTwoNum(123,24);
		
		
	}

}
