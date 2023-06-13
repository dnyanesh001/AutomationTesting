package methods;
public class Variable1 {
   
  // salary  variable is a static variable
   static double salary=10000.67;
   int empId=1001;
   
   public static void main(String args[]) {
	
	int age=30;//local variable
	//System.out.println("Salary: "+Variable1.salary);//10000.67
	Variable1 v1=new Variable1();
	System.out.println("EmpID: "+v1.empId);//1001
	System.out.println("age: "+age);
      
   }
}