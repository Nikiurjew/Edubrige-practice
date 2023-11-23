package basicsprograms;

public class Program_case4 {

	public static void main(String[] args) {
		byte b = 20;
		
		switch(b) {
		
		case 20:
			System.out.println("Hello");
			break;
		case 30:
			System.out.println("110");
			break;
		case 127: //byte range is -128 to 127 so the size should be less thn 127 or equal
			System.out.println("60");
			
		}

	}

}
