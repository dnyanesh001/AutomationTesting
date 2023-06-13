package overridingexamples;
class trail{
	int age=25;
	void calling(int age) {
		System.out.println(age);
		System.out.println(this.age);
	}
	void calling(double salary) {
		System.out.println(salary);
	}
	trail(){
		System.out.println("I am trail zero-param cons");
	}
	trail(int empId){
		this();
		System.out.println("I am trail int-param cons");
	}	
}
public class TotalRecall extends trail{
	
	int age =55;
	void calling(int i) {
		System.out.println("I am calling method of trotalrecall class");
		super.calling(55);
	}
	void display(int age) {
		System.out.println("Local age: "+age);
		System.out.println("Global age: "+this.age);
	}
	void display(char grade) {
		System.out.println("Local grade: "+grade);
		this.display(10);
	}
	
	TotalRecall(){
		this('a');
		System.out.println("I am zero-param cons of TotalRecall");
	}
	TotalRecall(char c){
		System.out.println("I am char-param cons of TotalRecall");
	}

	public static void main(String[] args) {		
		TotalRecall t1=new TotalRecall();
		t1.calling(25);
		t1.display('a');
	}

}
