package methods;
public class Method3 {

 static double x=10,y=20,z=30;//SGV
 public static void main(String[] args)
    {
        System.out.println("Input the first number: "+x);       
        System.out.println("Input the second number: "+y);      
        System.out.println("Input the third number: "+z);        
        System.out.println("The average value is " + average(z,y,x));
		System.out.println("The average value is " + average(10,20,30));
		System.out.println("The average value is " + average(54,67,33));
		System.out.println("The average value is " + average(34,54,76));
		System.out.println("The average value is " + average(123,43,234));
    }

  public static double average(double p, double q, double r)//p=z=30,q=y=20,r=x=10
    {
        return (p + q + r) / 3;
    }
}
