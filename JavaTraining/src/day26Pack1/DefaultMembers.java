package day26Pack1;

public class DefaultMembers {
	int accNum=12345;
	void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {		
		DefaultMembers p1=new DefaultMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessDefaultMembers {

	public static void main(String[] args) {		
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
/**
default member will be having visibility upto package level

*/