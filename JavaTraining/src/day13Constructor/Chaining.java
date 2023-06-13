package day13Constructor;
class Chain1{
	//default cons
	Chain1(){
		System.out.println("Chain1 cons..");
	}
}
class Chain2 extends Chain1{
	Chain2(int i){
		super();
		System.out.println("Chain2 cons..");
	}
}
public class Chaining extends Chain2{
	//default cons with default super()
	Chaining(){
		super(10);
		System.out.println("Chaining cons..");
	}
	public static void main(String[] args) {
		Chaining c1=new Chaining();
	}
}
