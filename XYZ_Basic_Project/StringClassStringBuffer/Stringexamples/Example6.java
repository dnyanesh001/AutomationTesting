package Stringexamples;
import java. util.Scanner;
import java. util.Arrays;
import com. basic.reverseArray;
public class Example6 extends reverseArray {
	private static int i = 0;
	static String StrArray[];
	static String temp ="";
	static String str2;
	public static void main(String[] args) {
		Scanner str1=new Scanner(System.in);
		String str=str1.nextLine();
		str=str+" ";
		str2=str;
		String StrArray[]= str.split(" ");	
		System.out.println(str);
//		System.out.println(StrArray.length);
//		to Print Characters One by One Form String
		for(int i=0;i<str.length();i++)
		{
			//System.out.print(str.charAt(i));
		}
		System.out.println("\n***********************");
		for(int i=StrArray.length-1;i>=0;i--)
		{
			System.out.print(StrArray[i]+" ");
		}
		System.out.println("\n "+StrArray.length);
		i=StrArray.length;
		
		for(i=(StrArray.length-1);i>=0;i--)
		{
			temp+=StrArray[i]+" ";
//			System.out.println(temp);
		}
		//System.out.println(temp);
		reverseArray(StrArray,StrArray.length);	
		//palinString(str);
		String s1="Bangalore";
		System.out.println(("Banglore")==s1);
		
		
		
	}
//	static void palinString(String str) {
//		//String str1=reverseArray(StrArray,StrArray.length);
//		if(str2.equals(temp))
//		{
//			System.out.println("\nThis is Palindrom String");
//		}else
//		{
//			System.out.println("\nThis is Not Palindrom String");
//		}
//	}
	
}
