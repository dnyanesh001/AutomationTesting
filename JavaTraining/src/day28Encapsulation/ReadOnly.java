package day28Encapsulation;
class Student2 {
	// private data member
	private int pinCode = 411015;
	// getter method for college
	public int getPinCode() {
		return pinCode;
	}
}
public class ReadOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student2 s = new Student2();
		// getting value of the name member
		System.out.println(s.getPinCode());
	}
}