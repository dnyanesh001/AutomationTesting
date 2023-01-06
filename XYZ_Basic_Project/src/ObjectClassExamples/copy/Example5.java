package ObjectClassExamples.copy;
class print12{
	int a=10;
	@Override
	public String toString() {
		return "I am Print12 Class toString";
	}
	@Override
	public int hashCode() {
		return 101;
	}
}
public class Example5 {
	public static void main(String args[])
	{
		Example5 s1= new Example5();
		System.out.println("s1: toSting of objectClass4: "+s1);
		System.out.println("s1: hashCOde of ObjectClass4: "+s1.hashCode());
		Example5 s2= new Example5();
		System.out.println("s2: toString of objectClass4: "+s2);
		System.out.println("s2: hashCode of ObjectClass4: "+s2.hashCode());
		System.out.println("s1 & s2 Compare:"+s1.equals(s2));// False
		Example5 s3=s2;//ObjectClass03 s3=s2=new Objectclass03();
		System.out.println("s3 & s2 compare:"+s3.equals(s2));//True
		print12 p1=new print12();
		System.out.println("toString of print: "+p1);
		System.out.println("hashCode of print: "+p1.hashCode());
		print12 p2=new print12();
		System.out.println("toString of print :"+p2);
		System.out.println("hashCode of Print :"+p2.hashCode());
		System.out.println("Comparing the print class Object p1 & p2"+p1.equals(p2));


	}
}
/*
 * ==--->compare two values
 * d1.equals (d2)-->compare two objects based on there address
 * 
 */
