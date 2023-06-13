package day29Casting;

public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		int myInt = 9;//
		double myDouble = myInt;//Implicit/auto widening ---> Java Compiler is doing casting here
		double d=(double)myInt;// Explicit Widening  ----> Programmer is doing casting
		System.out.println(myInt); //
		System.out.println(myDouble);//
		System.out.println(d);//

		double salary=23400.67856856898989545d;		
		int sal=(int)salary;//Explicit Narrowing ----> Programmer is doing casting
		long f=(long)salary;//Explicit Narrowing ----> Programmer is doing casting
		float f1=(float)salary;//Explicit Narrowing ----> Programmer is doing casting
		double var=sal;//Implicit Widening
		System.out.println("Actual Salary: "+salary);
		System.out.println("Int Salary: "+sal);
		System.out.println("long Salary: "+f);
		System.out.println("float Salary: "+f1);
		System.out.println("value of var: "+var);
	}

}
