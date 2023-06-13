package testNGPractice;

import org.testng.annotations.Test;

public class Sample1 {
	int age=25;
	void display() {
		System.out.println("I am Display");
	}
	@Test
	public void testCase1() {
		System.out.println("I am test case1.....");
		System.out.println("age: "+age);
		display();
	}
}
/**
*test run count depends on method having @Test  annotation
*/