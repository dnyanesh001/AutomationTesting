package day13Constructor;

public class MethodOverloading4 {

	public static void main(int args) {
		System.out.println("Main Method with int argument Executing");
		System.out.println(args);
	}

	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void call() {
		
	}
	public static void main(String[] args) {
		System.out.println("Original main Executing");
		MethodOverloading4.main(12);
		MethodOverloading4.main('c');
		MethodOverloading4.main(1236);
	}
}
