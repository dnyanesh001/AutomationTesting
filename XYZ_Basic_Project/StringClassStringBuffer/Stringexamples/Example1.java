package Stringexamples;

public class Example1 {
	public static void main(String[] args)
	{
		/**
		 * String class object can be created in two ways
		 * 1.Using literals""
		 * 2.Using new keyword
		 */
		String s1="Banglore";
		String s2="Mumbai";
		String s3="Banglore";//no new object created will be created as its a duplicate object
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		System.out.println("Compare s1 and s2 Object based on address:"+(s1==s2));
		System.out.println("Compare s2 and s2 Obdress bsed on address:"+(s2==s3));
		System.out.println("Compare s3 and s1 Object based on object:"+s1==s3);
		System .out.println("Comapre s1 and s2 Object based on values:"+s1.equals(s2));
		System.out.println("Compare s2 and s3 Object based on values"+s2.equals(s3));
		System.out.println("Compare s3 and s1 Object based on values "+s1.equals(s3));
		
	}
	
}
/**
in String some methods of object class are override
1.toString()---->to represent object in string format but in string class it will give value stored in object
2.equals()--->to compare two objects bsed on address but in String it compares two objects based on 
== to compare two object values but in string class it compare two object based on address
*/