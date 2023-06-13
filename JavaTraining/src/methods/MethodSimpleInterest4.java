package methods;
public class MethodSimpleInterest4
{
    public static void main(String args[]) 
    {
    	System.out.println("**************with return type****************");
    	int x=15000, z=7;
    	double y=6.5;
    	System.out.println(getInterest2(x,y,z));
    			//or    	
    	System.out.println(getInterest2(15000, 6.5, 7));
    			//or
    	double totalAmt=getInterest2(15000, 6.5, 7)+1500;
    	System.out.println(totalAmt);
    }
    static double getInterest2(int principal,double rof,int time) {
      	 //float principal=2000, rof=6, time=3, interest;        
           System.out.println("Enter the Principal : "+principal);       
           System.out.println("Enter the Rate of interest : "+rof);       
           System.out.println("Enter the Time period : "+time);       
           double interest = (principal * rof * time) / 100;
           //System.out.println("Simple Interest is: " +interest);
           return interest;
      }
}