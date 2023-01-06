package unboxing;

public class WrapperClass {
	public static void main (String args[]) {
		int a=20;
		//Converting int into Integer
		Integer k=new Integer(a);//converting int into Integer explicitly
		Integer I=new Integer(20);//converting int into Integer explicitly
		Integer j=a;//autounboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println("a: "+a+"\nk: "+k+"\nI: "+I+"\nj: "+j);
		System.out.println("****Unboxing of boxed object*****");
		//Converting Integer to int
		Integer a1=new Integer(3);
		int i1=a1.intValue();//converrting Integer into int explicitley
		System.out.println("a1: "+a1+"\ni1: "+i1);
		System.out.println("a1==i1"+(a1==i1));
		System.out.println("a1.equals(il): "+a1.equals(i1));
	}
}
/***

*Wrapper Class is a predefined class in java belongs to java.lang package
*its used to convert primitive type to object type
*				  ----->un-boxing operation ------>
*
*in wrapper class toString()& equals &'==' are overrided  
*
*/