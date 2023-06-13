package systemscannerexamples;

class training{
	training(){
		System.out.println("Training class const");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}
public final class SystemDemo2 {
	static training t1=new training();
	public static void main(String args[]) {
		training t2=new training();
		t2.manualTesting();
		t2.automationTesting();
		//accessing static member
		SystemDemo2.t1.manualTesting();
		SystemDemo2.t1.automationTesting();
		System.out.println("Hi, I am shailesh");
		System.err.println("Hi, I am Pune");//to display some message in the form of error
	}
}
