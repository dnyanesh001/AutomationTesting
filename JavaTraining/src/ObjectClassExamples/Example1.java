package ObjectClassExamples;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class Example1 extends Demo{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		
		Demo d1=new Demo();
		System.out.println(d1);//java compiler will write like ---> d1.toString(); --> give String representation of Object ---> FullyQualifiedClassname@hexadecimalAddress
		Demo d3=new Demo();
		System.out.println(d3.toString());		
		Demo d2=new Example1();
		System.out.println(d2);
		Example1 s = new Example1();
		// Below two statements are equivalent
		System.out.println(s);//java complier writes-->s.toString() -->string representation of an object--> FQCN@hexadecimaladdress
		System.out.println(s.toString());//string representation of an object
	}
}

/**
 * string representation---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress
 * 
 */
