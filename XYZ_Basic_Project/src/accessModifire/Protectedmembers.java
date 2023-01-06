package accessModifire;

public class Protectedmembers {
	protected int accNum=12345;
	protected void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args)
	{
		Protectedmembers p1 = new Protectedmembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessprotectedMembers
{
	public static void main(String[] args)
	{
		Protectedmembers p1=new Protectedmembers();
		System.out.println("accessing protecting members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

