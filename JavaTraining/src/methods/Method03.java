package methods;
public class Method03 {

	int age;//GNV
	void display() {
		System.out.println("I am display() of Method03 class and age value is: "+age);
	}
	void display(int a) {//int a=75;
		age=a;//age=a=75;
		System.out.println("I am display(int) of Method03 class and age value is: "+age);
	}
	public static void main(String[] args) {
		
		Method03 m2=new Method03();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m2.age);//0
		m2.display();
		m2.display(25);		
		System.out.println("age: "+m2.age);//25		
		System.out.println("******************************");
		Method03 m3=new Method03();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m3.age);//0
		m3.display(75);
		System.out.println("age: "+m3.age);//75
		m3.display();				
	}
}
