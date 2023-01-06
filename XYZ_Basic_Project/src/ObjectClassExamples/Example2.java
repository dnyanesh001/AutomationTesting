package ObjectClassExamples;

public class Example2 extends Demo {
	static int last_rollno=100;
	int roll_no;
	//Constructor
	Example2()
	{
		roll_no=last_rollno;
		last_rollno++;
	}
	//Driven code

	public static void main(String[] args) {
		Example2 s=new Example2();
		//Below two statements are equivalents -->String representation of  an object
		System.out.println(s);//s.toString()-->String representation of an object
		System.out.println(s.toString());//string representation of an object 
		System.out.println(s.hashCode());//it converts hexadecimal and return the values
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());//it converts hexadecimal and return the values in decimal		
	}

}
