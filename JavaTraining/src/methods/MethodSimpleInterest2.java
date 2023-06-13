package methods;
public class MethodSimpleInterest2
{
    public static void main(String args[]) 
    {
    	getInterest();
    	demo();
    }
    static void getInterest() {
    	 float principal=2000, rof=6, time=3, interest;        
         System.out.println("Enter the Principal : "+principal);       
         System.out.println("Enter the Rate of interest : "+rof);       
         System.out.println("Enter the Time period : "+time);       
         interest = (principal * rof * time) / 100;
         System.out.println("Simple Interest is: " +interest);
    }
    static void demo() {
    	System.out.println("Hello");
    }
}