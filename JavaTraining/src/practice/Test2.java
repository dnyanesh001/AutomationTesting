package practice;

//import Day8Methods.Method03;
//import Day8Methods.Method7;
//import Day8Methods.MethodCelsius;
		//or
//import Day8Methods.*;
public class Test2 {

	public static void main(String[] args) {
		//using Fully Qualified Class
		Day8Methods.MethodCelsius m1 = new Day8Methods.MethodCelsius();
		m1.temperaturecelsius(45);
		Day8Methods.Method7 m2=new Day8Methods.Method7();
		m2.add(25, 65);
		Day8Methods.Method03 m3=new Day8Methods.Method03();
		m3.display();
		m3.display(25);
	}
	
}
