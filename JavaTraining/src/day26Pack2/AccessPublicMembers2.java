package day26Pack2;

import day26Pack1.PublicMembers;

public class AccessPublicMembers2 {
	public static void main(String[] args) {

		PublicMembers p1 = new PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

class Demo {
	public static void main(String[] args) {
		PublicMembers p1 = new PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
