package stringexamples;

public class Example2 {

	public static void main(String[] args) {
		/**
		 * String class object can be create in two ways
		 * 1. using literals ""
		 * 2. using new keyword--> 2 Object created, 1 will be stored in String Constant Pool and another will be stored outside String Constant Pool, it allows duplicate object entry 
		 */
		String s1=new String("Bangalore");
		String s2=new String("Mumbai");
		String s3=new String("Bangalore");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("Compare s1 and s2 object based on address: "+(s1==s2));
		System.out.println("Compare s2 and s3 object based on address: "+(s3==s2));
		System.out.println("Compare s1 and s3 object based on address: "+(s1==s3));
		System.out.println("Compare s1 and s2 object based on value: "+s1.equals(s2));
		System.out.println("Compare s2 and s3 object based on value: "+s3.equals(s2));
		System.out.println("Compare s1 and s3 object based on value: "+s1.equals(s3));
	}
}
/**
in String some methods of object class are override
1. toString() ---> to represent object in string format but in String class it will give values stored in the object
2. equals() -----> to compare two object based on address but in String it compares two object based on there value
3. == to compare two values but in string class it compares two object based on address
*/