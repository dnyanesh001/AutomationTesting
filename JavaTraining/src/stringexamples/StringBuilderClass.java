package stringexamples;

public class StringBuilderClass {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		sb.reverse();
		System.out.println(sb);//prints Hello Java 
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));//address basis comparison
		System.out.println(sb1==sb2);//address basis comparison
		//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
		//first convert StringBuffer/StringBuilder to String class using toString()
		// dn use equals() of string class
		System.out.println((sb1.toString().equals(sb2.toString())));
	}
}
