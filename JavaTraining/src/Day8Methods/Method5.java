package Day8Methods;
class Call{
	public static void main(String[] args) {
		System.out.println("Hello, I am call class....");
	}
}
public class Method5 {

	double x = 10, y = 20, z = 30;
	boolean checkSameOrNot(int a,int b) {
		
		return (a==b);
	}
	static void display() {
		Method5 m2 = new Method5();
		System.out.println("Input the first number: " + m2.x);
		System.out.println("Input the second number: " + m2.y);
		System.out.println("Input the third number: " + m2.z);
	}
	public static void main(String[] args) {
		System.out.println("I am method5 class.........");
		Method5 m1 = new Method5();
		System.out.println("Input the first number: " + m1.x);
		System.out.println("Input the second number: " + m1.y);
		System.out.println("Input the third number: " + m1.z);
		m1.average(m1.x, m1.y, m1.z);
				//or
		//m1.average(10, 20, 30);
		boolean res=m1.checkSameOrNot(10,10);
		System.out.println(res);
		//System.out.println(m1.checkSameOrNot(10,20));
	}
	public void average(double p, double q, double r) //p=10,q=20,r=30
													  //p=m1.x=10,q=m1.y=20,r=m1.z=30
	{
		double res = (p + q + r) / 3;
		System.out.println("The average value is " + res);
	}
}
