package overridingexamples;

class Cal {
	// global variable
	// method
	// local variable
	// overloading
	// constructor
	// overloading
	// this keyword
	// this()
	// blocks
	// final
}
class Cal2 {
	// global variable
	// method
	// local variable
	// overloading
	// constructor
	// overloading
	// this keyword
	// this()
	// blocks
	// final
}

abstract class Cal3 extends Cal2 {
	// global variable
	// method
	// local variable
	// overloading
	// constructor
	// overloading
	// this keyword
	// this()
	// super
	// super()
	// blocks
	// final
}

interface sampleInt {
	// variable
	// method
}

public class Sample extends Cal3 implements sampleInt {
	// global variable
	// method
	// local variable
	// overloading
	// constructor
	// overloading
	// this keyword
	// this()
	// super
	// super()
	// blocks
	// final
	static String getValue(int b) {

		if (b == 1) {
			return "hi";
		} else if (b == 2) {
			return "hello";
		} else {
			return "bye";
		}
	}

	public static void main(String[] args) {
		System.out.println(getValue(3));
	}
}
