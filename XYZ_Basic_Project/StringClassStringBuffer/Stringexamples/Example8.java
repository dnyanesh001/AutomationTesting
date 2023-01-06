package Stringexamples;

public class Example8 {
	public static void main(String [] args) {
		String str="Pune"+1536;
		System.out.println(str);
		try{
		String str1=str.concat(null);
		System.out.println(str1);
		}catch (Throwable e) {
			System.out.println(e);
		}
		
	}

}
