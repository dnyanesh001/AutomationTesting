package Day8Methods;
public class Method1 {
   
  // salary  variable is a static variable
   static double salary=10000.67;
   static int empId=1001;  
   
   public static int getEmpID(){
	   System.out.println("printEmpID is running..");
	   return empId;
   }   
   public static void printEmpSal(){
	   System.out.println("printEmpSal is running.."+salary);
   }   
   public static void main(String args[]) {
	
	System.out.println("Program Starts");
	printEmpSal();
	//System.out.println(printEmpSal());// compile time error as void method won't return any value to JVM
	
	//getEmpID();//method body gets executed but you won't get its return value in the console as its stored on method
				//or
	//System.out.println(getEmpID());//method body gets executed and also print its return value in the console
				//or
	int res=getEmpID();//method body gets executed and its return value will be stored in variable for future use
	System.out.println(res);
	
	int sum=res+100;
	System.out.println("Final result: "+sum);
	System.out.println("Program Ends");
   }
}