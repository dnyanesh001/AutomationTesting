package Day32PredefinedClasses;

public class UnBoxingOperation2 {

	public static void main(String[] args) {
	
		Double doubleObj=25.2566;//autoboxing
		System.out.println("doubleObj: "+doubleObj);
		//only boxed object can be unboxed
		double salary=doubleObj.doubleValue();//unboxing 
		System.out.println(salary);
		System.out.println(doubleObj==salary);//
		
		Boolean b=true;//boxing
		boolean b1=b.booleanValue();//unboxing
		
		Character c1=new Character('a');//boxing
		char c2=c1.charValue();//unboxing
		
		Integer i=25;
		double d=i.intValue();//first auto boxing dn auto widening
	}
}
