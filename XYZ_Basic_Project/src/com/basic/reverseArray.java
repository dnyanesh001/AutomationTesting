package com.basic;
import java.util.Arrays;

//import com.basic.*;
public class reverseArray {
	 public static String reverseArray(String[] strArray, int size) 
	 { 
	        int i, k;
			String temp; 
	        for (i = 0; i < size / 2; i++) { 
	            temp = strArray[i]; 
	            strArray[i] = strArray[size - i - 1]; 
	            strArray[size - i - 1] = temp; 
	        }
	        String str="";
	     //  int b;
	      // strArray.length= b;
	        /*print the reversed array*/
	        System.out.println("Reversed Array: \n" + Arrays.toString(strArray)); 
	        for(String j:strArray)
	        {
	        	System.out.print(j+" ");
	        	str=(j+" ");
	        }
	        
	        return (str);
	 } 
}


