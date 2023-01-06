package accessModifirePack2;
import accessModifire.DefaultMembers;
public class AccessDefaultMembers2 {
	public static void main(String[] args)
	{
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing default members form another class within same package");
		System.out.println(p1.accNum);//to access it create create getter methods or make the accNum as public 
		p1.displayAccNum();//to access it need to convert it into the public
	}
}
