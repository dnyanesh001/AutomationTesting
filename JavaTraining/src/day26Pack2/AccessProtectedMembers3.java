package day26Pack2;

import day26Pack1.ProtectedMembers;

class AccessProtectedMembers3 extends ProtectedMembers {

	void calling() {
		System.out.println("I am calling...");
	}
	public static void main(String[] args) {
		
		AccessProtectedMembers3 p1=new AccessProtectedMembers3();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		p1.calling();
	}
}
class Example1 extends AccessProtectedMembers3{
	public static void main(String[] args) {
		Example1 a1=new Example1();
		a1.calling();
		a1.displayAccNum();
		System.out.println(a1.accNum);
		AccessProtectedMembers3 p1=new AccessProtectedMembers3();
//		p1.displayAccNum();// can't access from child class
//		System.out.println(p1.accNum); // can't access from child class
		p1.calling(); 
	}
}
