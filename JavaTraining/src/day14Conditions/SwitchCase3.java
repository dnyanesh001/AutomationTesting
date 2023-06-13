package day13Case;

public class SwitchCase3 {

	public static void main(String args[]) {
		char ch = 'a';
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, a vowel\n");
			break;
		case 'a':
			System.out.println("Value matched - a, a vowel");
			break;
		case 'w':
			System.out.println("Value matched - w, not a vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, a vowel");
			break;
		default:
			System.out.println("Sorry none of your cases matched");
			break;
		}
		System.out.println("Program ends here...");
	}

}
