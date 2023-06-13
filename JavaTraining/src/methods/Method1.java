package methods;
public class Method1 {

	static int age=25;
	
	static void sum(int num1,int num2) 
	{
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
	static double addition(int num1,int num2, int num3) 
	{
		double res=(num1+num2+num3);
		return res;
	}
	public static void main(String[] args) {
		
		Method1.sum(20, 30);
		System.out.println("Addtion of three numbers: "+Method1.addition(25, 50, 75));
				//or
		double res=Method1.addition(250, 12, 50);
		System.out.println("Sum of three numbers: "+res);
			
//		int num1=20,num2=30,res;
//		res=num1+num2;
//		System.out.println("Res: "+res);
//		System.out.println("**********************");
//		num1=50;
//		num2=80;
//		res=num1+num2;
//		System.out.println("Res: "+res);
//		System.out.println("**********************");
//		num1=150;
//		num2=80;
//		res=num1+num2;
//		System.out.println("Res: "+res);
	}

}
