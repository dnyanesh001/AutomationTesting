package practice;

public class MethodOverLoading {
		
	static void swapNumbers(int num1,int num2) {
		System.out.println("First Num1:"+num1);
		System.out.println("First Num2:"+num2);
		num1=num1+num2;//30
		num2=num1-num2;//10
		num1=num1-num2;//20
		System.out.println("First Num1:"+num1);
		System.out.println("First Num2:"+num2);
	}
	static void swapNumbers(double num1,double num2) {
		System.out.println("First Num1:"+num1);
		System.out.println("First Num2:"+num2);
		num1=num1+num2;//30
		num2=num1-num2;//10
		num1=num1-num2;//20
		System.out.println("First Num1:"+num1);
		System.out.println("First Num2:"+num2);
	}
	
	
	static int getAddition(int num1,int num2) {
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
//		int res=num1+num2;
//		return res;
			//or
		return (num1+ num2);
	}
	static int getAddition(int num1,int num2,int num3) {
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		System.out.println("num3: "+num3);
//		int res=num1+num2+num3;
//		return res;
		return (num1+ num2+num3);
	}
	
	public static void main(String[] args) {
//		MethodOverLoading.swapNumbers(20,70);
//		MethodOverLoading.swapNumbers(25d, 50d);
		int a=25,b=26,c=50;
		//System.out.println("res: "+MethodOverLoading.getAddition(a,b));
				//or
		int res=MethodOverLoading.getAddition(a,b);//(25+26)=51
		System.out.println("Res: "+res);
		System.out.println("**************");
		//System.out.println("res: "+MethodOverLoading.getAddition(a,b,c));
		res=MethodOverLoading.getAddition(a,b,c);
		System.out.println("Res: "+res);
		System.out.println("program ends");
	}
}
