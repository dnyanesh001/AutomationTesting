package abstractionexamples;
//Interface
interface Animal12 {
	int age=20;//by default public static final
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}
//Interface
interface Reptile {
	public void color(); // interface method (does not have a body)
}
//Interface
interface Reptile1 {
	public void color1(); // interface method (does not have a body)
}
// Pig "implements" the Animal interface
class Pig12 implements Animal12{
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}
class Dog12 extends Pig12 implements Reptile,Reptile1 {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bhow bhow");
	}
	public void color() {
		System.out.println("Color: blue");
	}
	public void color1() {
		System.out.println("Color: black");
	}
}
class Interface7 {
	public static void main(String[] args) {
		Pig12 p1=new Pig12();
		p1.animalSound();
		p1.sleep();
		Dog12 d1=new Dog12();
		d1.animalSound();
		d1.sleep();
		d1.color();
		d1.color1();
	}
}