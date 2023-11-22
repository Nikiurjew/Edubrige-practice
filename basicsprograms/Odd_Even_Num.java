package basicsprograms;

import java.util.Scanner;

public class Odd_Even_Num {
	public static void main(String[] args) {
		while(true) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	if (num % 2 ==0) {
		System.out.println("This number is Even");
	}
	else {
		System.out.println("odd");
	}
	}
}
}

