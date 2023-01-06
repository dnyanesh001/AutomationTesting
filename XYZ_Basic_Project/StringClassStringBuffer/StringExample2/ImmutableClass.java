package StringExample2;
/**
 * Immutable class: its value can't be changed, if you change new object will be created 
 * 1. class and data variable will be declare as final
 *2. constructor should be parameterized, to initialize final variable
 *3. use only getter method to get final variables value 
 */
class TestImmutableClass {
	final String name;
	final int salary;
	TestImmutableClass(String s1,int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		
		return salary;
	}
}
public class ImmutableClass{
	public static void main(String[] args) {
		TestImmutableClass t1=new TestImmutableClass("Nitin",25000);
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		//change its data variable creates new object
		TestImmutableClass t2=new TestImmutableClass("Nitin2",2500003);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
		
		
	}
}
