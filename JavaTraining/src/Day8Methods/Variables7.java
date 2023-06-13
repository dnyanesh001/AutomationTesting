package Day8Methods;
public class Variables7 {
   
  // salary  variable is a static variable
   static double salary=10000.67;
   int empId=1001;   
   public static void main(String args[]) {
	 
	//System.out.println("Salary: "+salary)
			//or
	System.out.println("Salary: "+Variables7.salary);//10000.67
	Variables7 v1=new Variables7();
	System.out.println("EmpID: "+v1.empId);//1001
      
	Variables7.salary=15000;
	System.out.println("Updated1 Salary: "+Variables7.salary);//15000
	v1.empId=150;
	System.out.println("Updated2 EmpID: "+v1.empId);//150
	
	Variables7 v2=new Variables7();
	System.out.println("EmpID: "+v2.empId);//1001
	v2.empId=500;
	System.out.println("EmpID: "+v2.empId);//500
	Variables7.salary=25000;
	System.out.println("Updated3 Salary: "+Variables7.salary);//25000
	
	Variables7 v3=new Variables7();
	System.out.println("EmpID: "+v3.empId);//1001
   }
}