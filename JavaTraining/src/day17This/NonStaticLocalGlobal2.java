package day17This;

public class NonStaticLocalGlobal2 {

	int empId=25;
	public static void main(String[] args) {
		int age=30;
		System.out.println("I am local age: "+age);
		NonStaticLocalGlobal2 n1=new NonStaticLocalGlobal2();
		n1.display();
	}
	void display() {
		int empId=45;
		System.out.println("I am local empId"+empId);
	}

}
