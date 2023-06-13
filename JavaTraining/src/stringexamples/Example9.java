package stringexamples;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="1235";
		System.out.println("s2 :"+s2);
		//int sum=s2+100;//compile time error, because we can't store String into int
		
		//if String object contains int value, dn before using it for any arithmetic operation first convert it into int
		int num=Integer.parseInt(s2);
		int sum=num+100;
		System.out.println("Result: "+sum);
	}

}
