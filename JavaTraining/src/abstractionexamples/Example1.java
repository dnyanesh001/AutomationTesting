package abstractionexamples;
interface Dadar{
	int age=25;// public static final int age =25;
	void printing();// public abstract void printing();
}
abstract class Mumbai{
	abstract void calling(int num);
}
class Maharastra extends Mumbai implements Dadar{
	//default constructor
	public void printing() {
		System.out.println("I am printing of Dadar");
	}
	void calling(int num) {
		System.out.println("I am abstract method of Mumbai");
	}
	Maharastra(int num){
		System.out.println("Maharastra number is: "+num);
	}
	void display() {
		System.out.println("I am display of Maharastra");
	}
	void businessHub() {
		System.out.println("Maharastra is a busines hub");
	}
}
class Pune extends Maharastra{
	//default constructor, default super()
	Pune(){
		super(25);
		System.out.println("Pune is in Maharastra");
	}
	void deccan() {
		System.out.println("Deccan is in Pune");
		display();
		super.display();
	}
	void display() {
		System.out.println("I am displaying Pune");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Pune p1=new Pune();
		p1.deccan();
		p1.businessHub();
		System.out.println("*************************");
		Maharastra m1=new Maharastra(25);
		m1.businessHub();
		m1.display();
		System.out.println("************************");
		Maharastra m2=new Pune();
		m2.businessHub();
		m2.display();		
	}
}
