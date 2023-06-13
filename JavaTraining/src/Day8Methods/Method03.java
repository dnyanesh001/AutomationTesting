package Day8Methods;

public class Method03 {

	int age;
	public void display() {
		System.out.println("I am display() of Method03 class and age value is: "+age);
	}
	public void display(int a) {
		age=a;
		System.out.println("I am display(int) of Method03 class and age value is: "+age);
	}
	public static void main(String[] args) {
		
		//Method03 m1;//no object creation at this step, its just a reference variable
				//new Method03();//yes, object got creation, but we don't know where this object got created after this step
		//m1=new Method03();//yes,object got created and with the help m1 reference we can access it's members
			//or
		Method03 m2=new Method03();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m2.age);//age=0
		m2.display();//age=0
		m2.display(25);//age=25		
		System.out.println("age: "+m2.age);//25
		
		Method03 m3=new Method03();//yes,object got created and with the help m1 reference we can access it's members
		m3.display(75);//age=75
		System.out.println("age: "+m3.age);//age=75
		m3.display();//age=75
				
	}
}
