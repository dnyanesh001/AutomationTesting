package day13Case;

public class SwitchCase3 {

	public static void main(String args[]) {
		char ch = 'i';
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, a vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'u':
			System.out.println("Value matched - u, a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, a vowel");
			break;
		default:
			System.out.println("Sorry none of your cases matched");
			break;
		}
		System.out.println("Program ends here...");
	}
}
