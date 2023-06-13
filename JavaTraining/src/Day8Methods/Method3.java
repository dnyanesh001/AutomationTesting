package Day8Methods;
public class Method3 {

 static double x,y,z;
 public static void main(String[] args)
    {
        System.out.println("Input the first number: "+x);       
        System.out.println("Input the second number: "+y);      
        System.out.println("Input the third number: "+z);    
        x=20;
        y=30;
        z=40;
        System.out.println("The average value is " + average(z,y,x));
		System.out.println("The average value is " + average(10,20,30));
		System.out.println("The average value is " + average(54.5,67.5,33));
		System.out.println("The average value is " + average(34.25f,54,76));
		System.out.println("The average value is " + average(123,43l,234));
    }

  public static double average(double p, double q, double r)
    {
        return (p + q + r) / 3;
    }
}
