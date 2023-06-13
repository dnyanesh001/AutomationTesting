package abstractionexamples;
interface Drawable2 {
	void draw();//by default public abstract
	default void msg() {
		System.out.println("default method");
	}
	static int cube(int x){
		return x*x*x;  
	}  	
//	default static int print(){ // default static can't be written together
//		System.out.println("default static method of interface");
//	} 
	
//	private void test() {
//		System.out.println("private method");
//	}
}
class Rectangle2 implements Drawable2 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class InterfaceDefaultStatic {
	public static void main(String args[]) {
		Drawable2 d = new Rectangle2();
		d.draw();
		d.msg();
		System.out.println(Drawable2.cube(3));  
	}
}