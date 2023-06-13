package stringexamples;

public class Example3 {

	public static void main(String[] args) {
		String s1="CoreJavaBasic";
		/**
		 * for below String two objects will be created
		 * 1. in non constant pool
		 * 2. in constant pool
		 */
		String s2=new String("BasicCodeJava");
		
		/**
		 * Ideally there should be two object created but in constant pool already "CoreJavaBasic" object is present
		 * hence only one object will be created in non constant pool area
		 */
		String s3=new String("CoreJavaBasic");

	}

}
