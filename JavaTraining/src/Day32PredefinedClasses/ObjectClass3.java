package Day32PredefinedClasses;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}
public class ObjectClass3 extends TestSample{

	static int last_roll = 100;
	int roll_no;
	// Constructor
	ObjectClass3()
    {
        roll_no = last_roll;
        last_roll++;
    }
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	// Driver code
	public static void main(String args[]) {
		ObjectClass3 s = new ObjectClass3();
		// Below two statements are equivalent
		System.out.println(s.hashCode());
		System.out.println(s);
		 TestSample t1=new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());
	}

}
