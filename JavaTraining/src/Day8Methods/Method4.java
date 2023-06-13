package Day8Methods;
public class Method4 {

static double x=10,y=20,z=30;
 public static void main(String[] args)
    {
        System.out.println("Input the first number: "+x);       
        System.out.println("Input the second number: "+y);      
        System.out.println("Input the third number: "+z);        
        average(x,y,z);
    }

  public static void average(double p, double q, double r)
    {
		double res=(p + q + r) / 3;
        System.out.println("The average value is " + res);
    }
}
