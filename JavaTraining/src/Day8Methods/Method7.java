package Day8Methods;

public class Method7 {

	float a=15.56f;
	public int add(int num1,int num2) {
		return (num1+num2);
	}
	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		Method7 m1=new Method7();
		System.out.println("NSGV a: "+m1.a);
		System.out.println(m1.add(25, 30));
		System.out.println("Program Ends");
	}
}
/*
static variable and static method ----> static member
nonstatic variable and nonstatic method ----> nonstatic member
*/