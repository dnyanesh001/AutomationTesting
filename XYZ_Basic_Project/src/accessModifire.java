class A2 {
	void test1() {
		System.out.println("Running test1()");
	}
}
class B2 extends A2 {
	void test2() {
		System.out.println("Running test2()");
	}
}
public class accessModifire {
	public static void main(String[] args) {
		A2 obj=new B2();//implicit up casting
		A2 obj1=(B2)new B2();//explicit up casting
		obj.test1();
	}

}
