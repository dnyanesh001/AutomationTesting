package stringexamples;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		String s1="CoreJavaBasic";
		System.out.println(s1.charAt(0));//C
		System.out.println(s1.charAt(2));//r
		System.out.println(s1.charAt(3));//e
		System.out.println(s1.charAt(1));//o
		System.out.println("Total char in String: "+s1.length());
		
		for(int i=0;i<s1.length();i++) {
			System.out.println("Char at index "+i+": " +s1.charAt(i));
		}
		System.out.println("********************************");
		String s2="Hi I am shailesh staying in Pune";
		for(int i=0;i<s2.length();i++) {
			System.out.println("Char at index "+i+": " +s2.charAt(i));
		}
		
		String name;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=scn.next();
		System.out.println("My name is "+name);
		
		String[] names=new String[5];
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter emp name: ");
			names[i]=scn.next();
		}
		
		for(String n:names) {
			System.out.println(n);
		}
	}
}
