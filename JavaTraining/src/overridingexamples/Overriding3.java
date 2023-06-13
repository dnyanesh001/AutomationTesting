package overridingexamples;

class Human {
	// Overridden method
	//in overriding we can increase the visibility of overrided method --> private -->default-->protected-->public
	// default ---> protected or public
	// protected ---> public
	// public ----> public
	void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human {
	// Overriding method
	public void eat() {
		System.out.println("Boy is eating");
	}
}
class Overriding3 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
		
		Human h1=new Boy();
		h1.eat();
	}
}