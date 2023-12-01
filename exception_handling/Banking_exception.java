package exception_handling;

import java.util.Scanner;

class MyClass extends Exception {
	MyClass(String message) {
		super(message);
	}

}

public class Banking_exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter your amt:");
		int bal =5000;
		//bal=5000;
		System.out.println("enter the withdraw amt:");
		int amt=sc.nextInt();
		

		try {
			if (amt> bal) {
				throw new MyClass("insufficient bal");

			} else {
				System.out.println("withdraw successfull");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
