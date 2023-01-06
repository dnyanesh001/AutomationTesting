package NonAccessModifires.java;

//code form filename:main.java
//abstract class
abstract class main{
	public String fname="john";
	public int age=24;
	public abstract void study();//abstract method 
}
//Subclass (inherit from main)
class Student extends main{

	@Override
	public void study() {
		// TODO Auto-generated method stub
		//body abstract method is provide here
		System.out.println("Studying all day long");
		
	}
	//End code from file name:Main.java
	//code from filename : AbstractKeyword.java
}
class AbstractKeyword {
	public static void main(String[] args)
	{
		//create an object of student class(which inherits attributes and method //from main)
		Student myObj=new Student();
		System.out.println("Name: "+myObj.fname);
		System.out.println("Age: "+myObj.age );
		
	}

}
