package Day32PredefinedClasses;

import java.util.Properties;

public class SystemCurrentTimeMillisExample2 {  
	  
    public static void main(String[] args) {  
        System.out.println("Current time in millisecond");  
        System.out.println(System.currentTimeMillis()); //method of calling current time in millisecond  
        System.out.println("Current time in nanoseconds = "+System.nanoTime());  
        SystemLineSeparatorExample3(); 
    }  
    
    public static void SystemLineSeparatorExample3 () {  
        //use of line separator  
        String a="Shubham"+System.lineSeparator()+"Jadon";  
        System.out.println(a);  
    } 
    
    public static void SystemGetPropertyExample7() {  
        //here we created property with my name and assigned its default value ShubhamJadon  
          
        System.out.println("my name : "+System.getProperty("myname", "Shubham Jadon"));  
    }  
    public static void SystemGetPropertiesExample6() {  
        System.out.println("Your System property for user");  
        Properties p = System.getProperties();  
        System.out.println(p.getProperty("user.name")); //property to get User's account name  
        System.out.println(p.getProperty("user.home")); //property to get User's home directory  
        System.out.println(p.getProperty("user.dir")); //property to get User's current working directory  
    }  
    
    public static void SystemIdentityHashCodeExample5() {  
        String a=new String ();  
        a.equals("Shubham");  
         System.out.println("identity hash code of object a = "+System.identityHashCode(a));  
         String b=new String ();  
            b.equals("Jadon");  
             System.out.println("identity hash code of object b = "+System.identityHashCode(b));          
    }  
}
