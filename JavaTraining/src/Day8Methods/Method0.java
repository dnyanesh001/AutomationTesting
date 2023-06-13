package Day8Methods;
public class Method0 {

	static void addTwoNum(int a,int b) {//int a=10, int b=20
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
		//return;//java complier will write behalf of program
	}
	public static void main(String[] args) {	
		
		addTwoNum(10, 20);
		addTwoNum(100, 200);
		Method0.addTwoNum(101, 202);
		Method0.addTwoNum(110, 208);
		Method0.addTwoNum(210, 205);
		
//		int x=10,y=20,res;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=100;
//		y=200;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=101;
//		y=202;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=105;
//		y=208;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
			
	}
}
