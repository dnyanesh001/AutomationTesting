package day28Encapsulation;

import Day32PredefinedClasses.SingleObject;

class Sampleton{
	/**
	 * 1. constructor should be private
	 * 2. create static instance/object of the class
	 * 3. create static method which return current class object
	 */
	int age=25;
	//1. constructor should be private
	private Sampleton() {
		System.out.println("Sampleton class cons");
	}
	//2. create static instance/object of the class
	static Sampleton singleObj=new Sampleton();

	//3. create static method which return current class object
	public static Sampleton getSampletonObject() {
		return singleObj;
	}
	void display() {
		System.out.println("I am display method, age: "+age);
	}
}
public class SingletonClass {
	static int getAge() {
		return 10;
	}
	public static void main(String[] args) {
		int res=SingletonClass.getAge();
		// TODO Auto-generated method stub
		//Sampleton s1=new Sampleton();// error as Sampleton is a signleton class
//		Sampleton.getSampletonObject().age=45;
//		Sampleton.getSampletonObject().display();  
//		Sampleton.getSampletonObject().age=30;		
		//or
		Sampleton s2=Sampleton.getSampletonObject();//indirect meaning---> Sampleton.getSampletonObject() ---> singleObj --->new Sampleton()
		s2.age=45;
		s2.display();
		s2.age=30;
	
		Sampleton sx=Sampleton.getSampletonObject();
		sx.display();
	}
}
/**
 * Singleton class: a class for which maximum one instance is allowed to create
 */ 
