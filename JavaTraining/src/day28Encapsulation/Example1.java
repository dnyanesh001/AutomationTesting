package day28Encapsulation;

class TestEncap {
	private int age = 25;
	private double salary = 45000;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Example1 {
	public static void main(String[] args) {
		TestEncap t1=new TestEncap();
//		System.out.println(t1.age);
//		System.out.println(t1.salary);
		System.out.println(t1.getAge());
		System.out.println(t1.getSalary());
		t1.setAge(35);
		t1.setSalary(58000);
		System.out.println("***************Updated values*****************");
		System.out.println(t1.getAge());
		System.out.println(t1.getSalary());
		
		TestEncap t2=new TestEncap();
		System.out.println(t2.getAge());
		System.out.println(t2.getSalary());
	}
}
