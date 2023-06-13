package methods;

public class Sample12 {

	int age=20;
	void display() {
		System.out.println("Display method..");
	}
	
	public static void main(String[] args) {
		
		/** object creation
		 *  classname refereancevaribale = new classname();
		 *  		//or
		 *  classname refereancevaribale;
		 *  refereancevaribale = new classname();
		 */
		Sample12 s1=new Sample12();
		System.out.println(s1.age);
		s1.display();
		s1.age=25;
		System.out.println(s1.age);
		System.out.println("************************");
		Sample12 s2=new Sample12();
		System.out.println(s2.age);
		s2.display();
	}

}
