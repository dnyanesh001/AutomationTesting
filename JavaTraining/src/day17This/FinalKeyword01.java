package day17This;

class FinalKeyword01 {
	
	public static void main(String args[]) {
		
		final int age=25;
		System.out.println("age: "+age);
		age=25;
		System.out.println("age: "+age);
		age=30;
		System.out.println("age: "+age);
		age=34;
		System.out.println("age: "+age);
	}
}
/**
* anything declared with final keyword known as constant
* any variable declared with final keyword should initialize at the same time
*
*/