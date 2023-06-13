public class Logicalop {
 public static void main(String[] args) {
  //Variables Definition and Initialization
  boolean bool1 = true, bool2 = false;

  //Logical AND
  System.out.println("bool1 && bool2 = " + (bool1 && bool2));
  
  //Logical OR
  System.out.println("bool1 || bool2 = " + (bool1 | bool2) );
  
  //Logical Not
  System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));

 }
}