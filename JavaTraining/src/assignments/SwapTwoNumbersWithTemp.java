package assignments;

public class SwapTwoNumbersWithTemp {

	public static void main(String[] args) {
		int num1=25,num2=30;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		num1=num1+num2;//num1=25+30=55
		num2=num1-num2;//num2=55-30=25
		num1=num1-num2;//num1=55-25=30
		System.out.println("******************");
		System.out.println("After swapping, Num1: "+num1);
		System.out.println("After swapping, Num2: "+num2);
	}

}
