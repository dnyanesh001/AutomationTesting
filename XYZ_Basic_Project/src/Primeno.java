import java.util.Scanner;

public class Primeno {
	public static void main(String args[]) {
		int a,count=0;
		System.out.print("Enter your No: ");
		Scanner bot=new Scanner(System.in);
		a=bot.nextInt();
		
		for(int i=2;i<a;i++) {
			if(a%i==0);
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(" This is prime no");
		}
		else {
			System.out.println(" This is not primno");
		}
		
	}

}
