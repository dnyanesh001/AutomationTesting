package Switch_Statement;

	public class calculator 
	{
		public static void main(String[] args)
		{

			System.out.println("Welcome here is calculator progaram for you ");
			System.out.println("press 1 for addition");
			System.out.println("press 2 for subtraction");
			System.out.println("press 3 for multiplication");
			System .out.println("press 4 for divission");
			int a=123,b=23;
			char calculator='1';
			switch (calculator)
			{
				case '1':
				{
					System.out.println("Welcome here is calculator progaram for you ");
					System.out.println("press 1 for addition");
					System.out.println("press 2 for subtraction");
					System.out.println("press 3 for multiplication");
					System .out.println("press 4 for divission");
					int k=123,d=23;
					char cal='1';
					switch (cal)
					{
						case '1':
						{
							
							System.out.println("addition is:\t"+(k+d));
							break;
						}
						default:
						{
							System.out.println("please Enter valid value");
							break;
						}
						case '2':
						{
							System.out.println("Substraction is:\t"+(a-b));
							break;
						}
						case '3':
						{
							System.out.println("multiplication is:\t "+(a*b));
							break;
						}
						case '4':
						{
							System.out.println("division is:\t"+(a/b));
							break;
						}
						
					}
					System.out.println("addition is:\t"+(a+b));
					break;
				}
				default:
				{
					System.out.println("please Enter valid value");
					break;
				}
				case '2':
				{
					System.out.println("Substraction is:\t"+(a-b));
					break;
				}
				case '3':
				{
					System.out.println("multiplication is:\t "+(a*b));
					break;
				}
				case '4':
				{
					System.out.println("division is:\t"+(a/b));
					break;
				}
				
			}
			
		}
	
	}
