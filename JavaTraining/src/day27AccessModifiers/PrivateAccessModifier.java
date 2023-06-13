package day27AccessModifiers;

class A {
	private int data = 40;
	private void msg() {
		System.out.println("Hello java");
	}
	public static void main(String args[]) {
		A a1=new A();
		System.out.println(a1.data);
		a1.msg();
	}
}

public class PrivateAccessModifier {
	private static int accountNum=12345;
	public static void main(String args[]) {
		System.out.println(PrivateAccessModifier.accountNum);
		A obj = new A();
		System.out.println(obj.data);// Compile Time Error
		obj.msg();// Compile Time Error
	}
}
/**
Private members can't be accessed from outside the class, because they are having visibility till class level
*/