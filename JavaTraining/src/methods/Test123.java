package methods;

public class Test123 {
	// non-static global variable
	double salary = 25000;

	public static void main(String[] args) {
		/*
		 * To access static member(variable & method) directly we can call them here or
		 * use classname.variable/method
		 */
		System.out.println(age); // or
		System.out.println(Test123.age);
		Test123.display();
		/*
		 * To access non-static member(variable & method) create an instance/object and
		 * dn with the help of reference variable we call access non-member
		 */
		Test123 t1 = new Test123();
		System.out.println(t1.salary);
		t1.call();
		t1.salary = 58232.2;
		System.out.println(t1.salary);
		Test123 t2 = new Test123();
		System.out.println(t2.salary);
		t2.call();
	}

	// static global variable
	static int age = 20;

	// static method
	static int display() {
		return 10;
	}

	// non-static method
	double call() {
		return 25.665;
	}

}
