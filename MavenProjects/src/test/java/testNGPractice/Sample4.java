package testNGPractice;

import org.testng.annotations.Test;

public class Sample4 {
	int age=25;
	@Test
	public void c_compose() {
		System.out.println("I am compose...");
	}
	@Test
	public void b_Compose() {
		System.out.println("I am compose...");
	}
	@Test
	public void a_compose() {
		System.out.println("I am compose...");
	}
}
