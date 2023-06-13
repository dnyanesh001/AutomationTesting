package stringexamples;

public class Example8 {

	public static void main(String[] args) {
		
		String str="Pune"+1536;
		System.out.println(str);
		String s1="Mumbai";
		System.out.println(s1.concat("Pune"));
		String s2="Joker"+null;
		System.out.println("S2: "+s2);
		String str1=str.concat(null);
		System.out.println(str1);
	}
}
/*
+ ---> 
concat(String)


*/