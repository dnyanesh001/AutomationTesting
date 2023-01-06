package Stringexamples;
import java.util.Scanner;
public class Example4 {
	public static void main(String [] args)
	{
		String s1="CoreJavaBasic";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(6));
		for(int i=0;i<s1.length();i++)
		{
			System.out.println("Char at index "+i+":"+s1.charAt(i));
		}
		String s2="HI I am Dnyanesh Studying The Automation in pune";
//		for(int i=0;i<s2.length();i++)
//		{
//			System.out.println(i+"   "+s2.charAt(i));
//		}
		System.out.println("Last Index of i : "+s2.indexOf(" The ",'e'));
		String name;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=scn.nextLine();
		System.out.println("My name is "+name);
		
		String[] names=new String[5];
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter emp name: ");
			names[i]=scn.nextLine();
		}
		int i=1;
		for(String n:names) {
			System.out.print(i+"    ");
			System.out.println(n);
			i++;
		}
		scn.close();
	}

}
