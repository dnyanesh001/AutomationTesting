package Boxing;

public class BoxingOperation {
	public static void main(String args[]) {
		int age =10;
		System.out.println("Age: "+age);
		Integer obj=14;//implicit /auto boxing--->java compiler converts it into Integer obj=new Integer(45);
		System.out.println("Obj : "+obj);
		Integer intobj=new Integer(age);//Explicit boxing
		System.out.println("intobj: "+intobj);
		System.out.println(age==intobj);
		System.out.println(intobj.equals(age));
		Integer intobj1=new Integer(50);//explicit boxing operation
		System.out.println("intobj1 :"+intobj1);
		Integer intObIntegerj2=30;
		System.out.println("intObIntegerj2: "+intObIntegerj2);
		char c1='z';
		Character xyz=c1;
		Character cObj=new Character(c1);
		System.out.println(c1);
		System.out.println(xyz);
		System.out.println(cObj);
				
	}

}
