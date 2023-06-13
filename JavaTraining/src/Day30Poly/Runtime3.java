package Day30Poly;

class Car {
	void run() {
		System.out.println("running");
	}
}
class innova extends Car {
	void run()
	{
		System.out.println("running fast at 120km");
	}
}
public class Runtime3 {
	public static void main(String args[]) {
		Car c = new innova();
		c.run();//
	}
}