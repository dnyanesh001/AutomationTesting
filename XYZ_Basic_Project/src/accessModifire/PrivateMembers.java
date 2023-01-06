package accessModifire;

/**
 * @author p
 *
 */
public class PrivateMembers {
	private int accNum=12345;
	private void displayAccNum()
	{
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args)
	{
		PrivateMembers p1=new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPrivateMembers2{
	public static void main(String[] args)
	{
		PrivateMembers p1 = new PrivateMembers();
		System.out.println(p1.accNum);	//private Variable are not visible in the another class
		p1.displayAccNum();				//private methods are not visible in another class directly
	}
}
