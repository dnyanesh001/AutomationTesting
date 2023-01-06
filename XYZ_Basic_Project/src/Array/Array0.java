package Array;

public class Array0 {
	static String[] cars= {"volvo","Bmw","ford","Mazada"};
	public static void main(String[] args)
	{
//		String[] cars;
//		cars=new String[4];  or
		String[] cars=new String[4]; //the declaration of the cars array as the String 
		cars[0]="Volvo";
		cars[1]="BMW";
		cars[2]="mazda";
		cars[3]="ford";//the array Initialisation;
		//Access the Elements of an Array
		int i=2; 
		System.out.println(cars[i]);
		System.out.println(cars[2]);
		//changing an elements
		System.out.println(cars[2]="lamborgini");
		cars[i]="battista";
		System.out.println(cars[2]);
		//array element count 
		System.out.println(cars.length);
		Array0 a=new Array0();
		a.For();
	}
	public void For() {
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		for(String i:cars) {
			System.out.println(i);
		}
	}
	

}
