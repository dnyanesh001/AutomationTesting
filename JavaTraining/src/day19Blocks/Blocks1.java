package day19Blocks;

public class Blocks1 {
	/* static block or static initialization block or SIB */
	static {
		System.out.println("******** Running static-block1 of class Blocks1..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks1 class...");
		System.out.println("main() ends");
	}
}
