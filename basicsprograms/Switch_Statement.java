package basicsprograms;

public class Switch_Statement {

	public static void main(String[] args) {
		int x = 20;
		switch (x) {
		case 10 :
			System.out.println("Hello");
		
		break;
		
		case 20:
			System.out.println("Hi");
			break;
			
		default:
				System.out.println("World");// default can be written anywhere and the condition doesnt matches den default will be printed
				break;
			
		case 21:
				System.out.println("java");
				break;

	}
	}

}
