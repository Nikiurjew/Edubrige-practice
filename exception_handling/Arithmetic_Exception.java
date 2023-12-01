package exception_handling;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			System.out.println("2");
			System.out.println(100/2);
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e);// this line will simply print the syso output
			e.printStackTrace(); // this will track the exception and show the line 
		}
		System.out.println("4");

	}

}
