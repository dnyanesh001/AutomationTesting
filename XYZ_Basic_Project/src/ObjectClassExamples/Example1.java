package ObjectClassExamples;
class Demo{
	void Display() {
		System.out.println("I am an Display method");
	}
}
public class Example1 extends Demo{
	static int last_rollno=100;
	int rollno;
	//Constructor
	Example1()
	{
		rollno=last_rollno;	
		last_rollno++;
	}
	//Driven code
	public static void main(String args[])
	{
		Example1 s=new Example1();
		//Below two Statements are equivalent
		System.out.println(s);
		//java compiler writes-->s.toString()__>String  represent an Object->FQN@hexadecimaladress
		System.out.println(s.toString());//String representation of an object
		Demo d1=new Demo();
		System.out.println(d1);
		Demo d=new Example1();
		d.Display();
		System.out.println(d);
	}
}
/**
 * string representation -->fullyclassifiedclassname@hexadecimaladdress
 * packagename.classname@hexadecimal address
 */
