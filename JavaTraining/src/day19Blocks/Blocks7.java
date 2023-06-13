package day19Blocks;
public class Blocks7 {
	static int age;
	double salary;
	/* static block or SIB */
	static {
		age = 30;
		System.out.println("I am SIB");
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
		System.out.println("I am NSIB/IIB");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + Blocks7.age);
		System.out.println("---------------------------------");
		Blocks7 b1 = new Blocks7();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}
}
