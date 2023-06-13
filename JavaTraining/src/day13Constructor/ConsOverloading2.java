package day13Constructor;
class ConsOverloading2 {
	int age;
	double salary;
	ConsOverloading2() {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	ConsOverloading2(int a) {
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age=a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}
	ConsOverloading2(double b) {
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary=b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}
	ConsOverloading2(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age=a;
		salary=b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
	}

	public static void main(String args[]) {
		ConsOverloading2 pc1 = new ConsOverloading2();
		System.out.println("After Zero-para constructor,Age= "+pc1.age);//0
		System.out.println("After Zero-para constructor,Salary= "+pc1.salary);//0.0		
		
		ConsOverloading2 pc2 = new ConsOverloading2(33);
		System.out.println("After int-para constructor,Age= "+pc2.age);//33
		System.out.println("After int-para constructor,Salary= "+pc2.salary);//0.0
		
		ConsOverloading2 pc3 = new ConsOverloading2(34000.34);
		System.out.println("After double-para constructor,Age= "+pc3.age);//0
		System.out.println("After double-para constructor,Salary= "+pc3.salary);//34000.34
		
		ConsOverloading2 pc4 = new ConsOverloading2(30,95000.34);
		System.out.println("After int-double-para constructor,Age= "+pc4.age);//30
		System.out.println("After int-double-para constructor,Salary= "+pc4.salary);//95000.34
	}
}
/**
 * what is local variable
 * what is global variable
 * what is class
 * what data type indicates
 * what is method/function
 * why to use variable
 * why to use local variable
 * why to use global variable
 * why to use function
 * what is method overloading and why to use it
 * what is constructor
 * what is the use of constructor
 * type of constructor
 * why to use constructor overloading
 * diff b/w
 * 		1. local vs global variable
 * 		2. static vs non-static
 * 		3. method vs constructor
 */
