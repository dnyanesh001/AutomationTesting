package Day8Methods;

public class StaticMethodExample2 {

	public static void main(String[] args) {
		// TODO create a method to add two number
		addTwoNumber(25, 50);
		//System.out.println(addTwoNumber(10, 20));//error: we can't use method with return type as void inside println()
		
		// TODO create a method to multiple two number and add 100 on the result
		
		//multiplyTwoNumbers(10, 20);//method will be executed but we won't be able to print its return value
				//or
		//System.out.println("Result: "+multiplyTwoNumbers(10, 20));//method will be executed and we will also able to print its return value in the console
				//or
		int res=StaticMethodExample2.multiplyTwoNumbers(10, 20);//method body will be executed and also its return in stored in a variable for future use
		System.out.println("Result: "+res);
		int finalValue=res+100;
		System.out.println("Updated final value is: "+finalValue);
		
	}
	static int multiplyTwoNumbers(int n1, int n2) {
		System.out.println("Number1 : "+n1);
		System.out.println("Number2 : "+n2);
		int res=n1*n2;
		return res;
	}
	static void addTwoNumber(int num1,int num2)
	{
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		int res=num1+num2;
		System.out.println("Result is: "+res);
	}
}
