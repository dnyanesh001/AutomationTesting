package practice;

public class Factor {
	
	static void factorOfNegative(int number) {
		System.out.println("Factors of"+number+" are:");
		for(int i=number;i<=Math.abs(number);++i) {
			
			if(i==0) {
				continue;
			}else {
				if(number%i==0) {
					System.out.print(i+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Factor.factorOfNegative(-60);
	}
}

/**
 * break point on required location
 * next line: F6 or function key+f6
 * continue: f8 or fn+f8
 * inspect value: ctrl+shift+i
 */
