package Day32PredefinedClasses;
class Demo123{
	void display() {
		System.out.println("I am display() of class Demo123");
	}
}
public class ObjectClass2 extends Demo123{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	ObjectClass2()
    {
        roll_no = last_roll;//100
        last_roll++;//101
    }
	@Override
	void display() {
		System.out.println("I am display() of class ObjectClass2");
	}
	@Override
	public int hashCode() {
		return roll_no;
	}
	// Driver code
	public static void main(String args[]) {
		ObjectClass2 s = new ObjectClass2();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("hashCode() value from ObjectClass2: "+s.hashCode());//
		s.display();//
		
		Demo123 d2=new Demo123();
		System.out.println(d2);
		System.out.println("hashCode() value from Demo123: "+d2.hashCode());		
	}

}
