package assignments;

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		int num1=25,num2=30,temp;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		temp=num1;//temp=25
		num1=num2;//num1=30
		num2=temp;//num2=25		
		System.out.println("******************");
		System.out.println("After swapping, Num1: "+num1);
		System.out.println("After swapping, Num2: "+num2);
	}

}
