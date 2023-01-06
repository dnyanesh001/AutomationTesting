package accessModifirePack2;
import accessModifire.Modifires;
public class AccessModifires extends  Modifires{
	public static void main(String[] args)
	{
		 AccessModifires a1= new AccessModifires();
		 Modifires b1=new Modifires();
		 //System.out.println("private variable: "+a1.num1);//private members not allow to the access outside of the class
		 //System.out.println("Default variable: "+a1.num2);//default members not allows to access outside the method
		 System.out.println("protected variable: "+a1.num3);
		 System.out.println("public variable: "+b1.num4);
	 }
}
