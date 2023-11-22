package basicsprograms;

import java.util.Scanner;

public class PositiveNumberByUserInput {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int num = sc.nextInt();
		if(num >=0) {
			System.out.println("Positive");
			
		}
		else if(num<0) {
			System.out.println("Negetive");
		}
		else {
			System.out.println("invalid");
		}
		}

	}

}
