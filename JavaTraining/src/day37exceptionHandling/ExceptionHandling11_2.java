package day37exceptionHandling;
// Throwing Unchecked Exception
public class ExceptionHandling11_2 {   
    //function to check if person is eligible to vote or not   
    public static void signalTimeout(long time) { 
    	System.out.println("Signal started");
        if(time>1000) {  
              try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
        System.out.println("Signal ends...");
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
    	System.out.println("I am main....");
		signalTimeout(2000);
        System.out.println("rest of the code...");    
  }    
}    