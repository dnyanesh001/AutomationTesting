package ObjectClassExamples.copy;
class TestSample{
	void callMe() {
		System.out.println("Hello");
	}
}
public class Example4 {
	static int last_roll=100;
	int roll_no;
	//Constructor
	Example4()
	{
		roll_no=last_roll;
		last_roll++;
	}
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
	public String toString()
	{
		return "Basic Core java";
	}
	//Driven code
	public static void main(String[] args)
	{
		Example4 s=new Example4();
		//Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.hashCode());
		TestSample t1= new TestSample();
		System.out.println(t1);
		System.out.println(t1.hashCode());
	}
}
