
public class SwitchcaseBYkripa 

{
public static void main(String[] args)
{
	SwitchcaseBYkripa obj = new SwitchcaseBYkripa();
	System.out.println("** Program Start **");
	obj.Noswitchtospell();
	System.out.println("** Program End **");
}
public void Noswitchtospell()
{
	char userinput='4';
	switch(userinput)
	{
	case '1':
		System.out.println("one");
		break;
	case '2':
		System.out.println("two");
		break;
	case '3':
		System.out.println("three");
		break;
	case '4':
		System.out.println("four");
		break;
	case '5':
		System.out.println("five");
		break;
	case '6':
		System.out.println("six");
		break;
	case '7':
		System.out.println("seven");
		break;
	case '8':
		System.out.println("eight");
		break;
	case '9':
		System.out.println("nine");
		break;
	case '0':
		System.out.println("zero");
		break;
	default:
		System.out.println("invalid input.");
		
	
	}
	
}
}
