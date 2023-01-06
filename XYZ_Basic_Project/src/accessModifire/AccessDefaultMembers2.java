package accessModifire;

public class AccessDefaultMembers2 {
	public static void main(String[] args)
	{
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing default membrs from another class within same pakage");
		System.out.println("p1.accNum");
		p1.displayAccNum();
	}
}
//default member will be having visibility upto level*/