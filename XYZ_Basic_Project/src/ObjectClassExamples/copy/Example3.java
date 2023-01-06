package ObjectClassExamples.copy;
class Demo123{
	void display() {
		System.out.println("I am Display() of class Demo123");
	}
}
public class Example3 extends Demo123{
	static int last_roll=100;
	int roll_no;
	//Constructor
	Example3()
	{
		roll_no=last_roll;
		last_roll++;
	}
	@Override
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}
	@Override
	public int hashCode() {
		return roll_no;
	}
	//Driven code
	public static void main(String[] args) {
		Example3 s=new Example3();
		//Below two statements are equivalent 
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("hashcode value from objectclass2 : "+s.hashCode());
		s.display();
		
		Demo123 d2=new Demo123();
		System.out.println(d2);
		System.out.println("hashCode() value from Demo123: "+d2.hashCode());
	}
}
