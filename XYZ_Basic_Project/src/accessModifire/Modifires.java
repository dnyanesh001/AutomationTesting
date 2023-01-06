package accessModifire;

public class Modifires {
	private int num1=10;
	int num2=20;
	protected int num3=30;
	public int num4=40;
	
	public static void main(String[] args)
	{
		Modifires m1=new Modifires();
		System.out.println("private variable: "+ m1.num1);
		System.out.println("default variable: "+m1.num2);
		System.out.println("protected variable: "+ m1.num3);
		System.out.println("public varaible: "+m1.num4);
	}

}
class AccessModifires{
	public static void main(String[] args )
	{
		Modifires m1=new Modifires();
		//System.out.println("private variable: "+m1.num1);//private class dont allow to access the member outside the class
		System.out.println("default variable: "+m1.num2);
		System.out.println("prtected variable: "+m1.num3);
		System.out.println("public variable: "+ m1.num4);
		
	}
}