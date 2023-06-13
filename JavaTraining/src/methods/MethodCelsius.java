package methods;
public class MethodCelsius  
 {  
   public static void main (String args[])  
    { 
		  float fahrenheit, celsius;  
          fahrenheit = 43;  
          celsius  = ((fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+celsius); 
          
          System.out.println(getCelsiusFromFahrenheit(45));
          System.out.println(getCelsiusFromFahrenheit(35.56));
          System.out.println(getCelsiusFromFahrenheit(38.45));
    }
   
   /**
    * method ---> static or non-static
    * 		 ---> return or not
    * 		 ---> argument or not
    */
   static double getCelsiusFromFahrenheit(double fhn) {
	   double  celsius  = ((fhn-32)*5)/9;  
	   return celsius;
   }
   static void getCelsiusFromFahrenhei2(double fhn) {
	   double  celsius  = ((fhn-32)*5)/9;  
	   System.out.println(celsius);
   }
   
   /**
    * method to calculate area of triangle = 0.5*b*h;
    * method to calculate area of circle = 3.14*r*r;
    * method to calculate area of rectangle = l*b;
    * method to calculate area of square = s*s;
    */
}  