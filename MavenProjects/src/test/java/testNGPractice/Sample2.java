package testNGPractice;

import org.testng.annotations.Test;

public class Sample2 {
	int age=25;
	@Test
	public void testCase2() {
		System.out.println("I am Test case 2");
		System.out.println("age: "+age);
	}
	@Test
	public void testCase3() {
		System.out.println("I am test case 3");
		System.out.println("age: "+age);
	}
	@Test
	public void testCase1() {
		System.out.println("I am tes case 1");
		System.out.println("age: "+age);
	}
}
/**
 * If class is having more than one test case then all test method will be executed alphabetical order
 */
