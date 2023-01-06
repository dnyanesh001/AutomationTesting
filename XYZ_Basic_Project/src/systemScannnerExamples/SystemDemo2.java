package systemScannnerExamples;
class training{
	training(){
		System.out.println("Training Class Constant");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am From Automation Testing");

	}
}
public class SystemDemo2 {
	static training t1=new training();
	public static void main(String[] args)
	{
		training t2=new training();
		t2.manualTesting();
		t2.automationTesting();
		//accessing static members 
		SystemDemo2.t1.automationTesting();
		SystemDemo2.t1.manualTesting();
		System.out.println("Hi ,I am Dnyanesh");
		System.err.println("Hi,I am pune");//to display some message in the from of error 
	}

}
