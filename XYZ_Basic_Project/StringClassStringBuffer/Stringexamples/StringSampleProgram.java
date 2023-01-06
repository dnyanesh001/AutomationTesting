package Stringexamples;

public class StringSampleProgram {
	public static void main(String[] args) {
		String s1="CoreJavaBasics";
		System.out.println("String Length"+s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 8));
		//Concatenate String
		String s2="Core";
		String s3="javaBasic";
		System.out.println("FIrst value"+s2);
		System.out.println("second value"+s3);
		System.out.println("Conacatinates String"+s2.concat(s3));
		String p1="pune";
		String p2="Mumbai";
		String X1=s2.concat(s3);
		String X2=p1.concat(p2);
		String X3=X1+X2;
		System.out.println(X3);
		String D1=p1+12;
		System.out.println(D1);
		//Returns the index within the string
		//of the first occurrence of the specified String 
		String s5="Learn Share Learn Share";
		System.out.println("s5 size: "+s5.length());
		System.out.println("Index of share starts form: "+s5.indexOf("Share"));
		//Returns the index within the string of the
		//first occurrence of the specified string,
		//Starting  at the specified index.
		System.out.println("Index of e = "+s5.indexOf('e',3));
		System.out.println("Index of a = "+s5.indexOf('a',22));
		System.out.println("last Index of Learn"+s5.lastIndexOf("Learn"));
		//Last Index within string last occurrence form specified Index
		System.out.println("Last occurance of the share form 3"+s5.lastIndexOf("Share",23));
		//Occurrence of "Share" before index
		//Checking equality of String
		String s6="Selenium";
		String s7="selenium";
		String s8="Selenium";
		System.out.println("Checking Equality of s6 & s7:"+s6.equals(s7));
		System.out.println("Checking Equality of s6 & s8:"+s6.equals(s8));
		System.out.println("Checking equality of s6 & s7"+s6.equalsIgnoreCase(s7));
		//Converting cases
		String Word2 ="          CoreJava";
		System.out.println("Changing to Upper Case "+Word2.toUpperCase());
		System.out.println("Changing to lower Case" +Word2.toLowerCase());
		//Trimming the word
		String word4="Learn Share Learn  ";
		System.out.println("Acctual String "+word4);
		System.out.println("Actual Lenagth "+word4.length());
		System.out.println("After Trim String :"+word4.trim());
		System.out.println("After trim String length :"+word4.trim().length());
		//Replacing characters
		String str1="CoreJavaBasic";
		String str2=str1.replace('c','x');
		System.out.println(" Original Sting is : "+str1);
		System.out.println("Changed String is : "+str2);
		String str3=str1.replace("Java", "Net");
		System.out.println(" After Replacing Java To Net : "+str3);
		String str4=str1.replaceFirst("a", "B");
		System.out.println("After changing First a to B : "+str4);//
		String str5=" ";
		System.out.println("str is empty or not : "+str5.isEmpty());
		String str6="";
		System.out.println("str is empty or not : "+str6.isEmpty());
	}

}
