package accessModifirePack2;
import accessModifire.Protectedmembers;
public class AccessProtectedMembers2 extends Protectedmembers{
	public static void main(String[] args)
	{
		AccessProtectedMembers2 p1=new AccessProtectedMembers2();
		System.out.println("Accessing Protected members form an other class outside of the package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
	}

}
