package Day8Methods;

public class StaticMethodExample1 {

	public static void main(String[] args) {
//		System.out.println("Hi, I am shailesh");
//		System.out.println("I am your automation trainer");
//		System.out.println("I am from UP");
		displayPersonalInfo();
		displayPersonalInfo();
		//when you want to display information with Dynamic values
		displayPersonalInfo("Jay","Manual","Pune");
		displayPersonalInfo("Amar","API","Bangalore");
		//execute calling method
		calling(123456);
		calling(9876542);
		int i=6568983;
		calling(i);
	}
	public static void displayPersonalInfo() {
		System.out.println("Hi, I am shailesh");
		System.out.println("I am your automation trainer");
		System.out.println("I am from UP");
	}
	public static void displayPersonalInfo(String name,String prof,String location) {
		System.out.println("Hi, I am "+name);
		System.out.println("I am your "+prof+" trainer");
		System.out.println("I am from "+location);
	}
	public static void calling(int num) {//int num=i=6568983
		System.out.println("Hi, I am xyz");
		System.out.println("calling using number: "+num);
	}

}
