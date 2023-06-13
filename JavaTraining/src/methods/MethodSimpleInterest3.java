package methods;



public class MethodSimpleInterest3
{
    public static void main(String args[]) 
    {
    	getInterest1(2000, 6, 3);
    	System.out.println("***************");
    	getInterest1(2500, 6, 3);
    	System.out.println("***************");
    	getInterest1(3550, 6, 3);
    }
   
    static void getInterest1(int principal,double rof,int time) {
   	 //float principal=2000, rof=6, time=3, interest;        
        System.out.println("Enter the Principal : "+principal);       
        System.out.println("Enter the Rate of interest : "+rof);       
        System.out.println("Enter the Time period : "+time);       
        double interest = (principal * rof * time) / 100;
        System.out.println("Simple Interest is: " +interest);
   }
}