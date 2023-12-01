package exception_handling;

import java.util.Scanner;

class MyClass extends Exception{
	MyClass(String message){
		super(message);
	}
	
}
public class Exception_Eligible_vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		try {
			if(age < 18) {
				throw new MyClass("your are not eligible to vote");
				
			}
			else {
				System.out.println("Your are Eligible to vote");
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	
		

	}

}

