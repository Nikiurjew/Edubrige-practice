package basicsprograms;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day:");
		int wd = sc.nextInt();
		switch(wd) {
		case 1 :
			System.out.println("Monday");
		break;
		case 2 :
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
		}
		}

	}

}
