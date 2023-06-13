package inhertanceexamples;
//parent class/super class/base class
class fruit {
	fruit(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class/sub-class of fruit
class apple extends fruit {
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		apple fr = new apple(); // object of child class
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class
	}
}