package interfacePogram;

interface i1{
	//variable --->by default ---->public static final
	//method--->by default ---->public abstract
	//no complete methods /non-abstract
	//no constructor
}
//Interface declaration: by first user
interface Drawable{
	int salary=25000;//by default --->public static final int saary=25000;
	void draw();//by default--->public abstract void draw();
}
//Implementation : by second user
class Rectangle1 implements Drawable
{
	@Override
	public void draw() {
		System.out.println("drawing rectangle");
		
	}
	
}
class Circle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawnig circle");
		
	}
	
}
//Using interface:by third user
public class Interface1 {
	public static void main(String[] args)
	{
		System.out.println("Interface variable: "+Drawable.salary);
		Rectangle1 r1=new Rectangle1();
		r1.draw();//drawing rectangle
		Circle c1=new Circle();
		c1.draw();//drawing Circle
		//In real scenario,object is provided by method e.g. getDrawable()
		Drawable d=new Circle();
		d.draw();//drawing circle
	}
}
/**
 * Inteface-->used to acieve abstraction in java
 *                   -->as we know java doesn't support multiple interface using clases to overcome this
 *						java provides interface to support this 
 *					--->its 100% abstract ,0% non abstract
 *                  --->Inside the interface will have (no constructor0
 *                  -Variable--->by default---> by default public static final
 *                  -method --->by default --->public abstract
 *                  ___>whenever Subclass inherits the interface then they use implement keywords
 *                  class childclass implenrts interfacename {
 *                  }
 *                  -->As we are not allowed to create an instance of abstract class simillarly we are not allowed to create
 *                  instance of 
 *                  interface(because its also incomplete
 *                  -->when a intrface is getting then there will be contrac between these classes thats
 *                  subclass needs to overide subclass becomes abstract class 
 *                  -->between
 *                  use 'extends'
 *                  								1.two classes we use 'extends'
 *                  								2.two interace we use 'extends'
 *                  								3.class and interface use 'implements'
 *                  */
 *                  
 *                  
