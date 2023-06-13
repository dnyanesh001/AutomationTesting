package Day32PredefinedClasses;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class ObjectClass extends Demo{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	ObjectClass()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		ObjectClass s = new ObjectClass();
		// Below two statements are equivalent
		System.out.println(s);//java complier writes-->s.toString() -->string representation of an object--> FQCN@hexadecimaladdress
		System.out.println(s.toString());//string representation of an object
		Demo d1=new Demo();
		System.out.println(d1);//d1.toString();
		Demo d3=new Demo();
		System.out.println(d3.toString());		
		Demo d2=new ObjectClass();
		System.out.println(d2);
	}
}

/**
 * string representation---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress
 * 
 */
