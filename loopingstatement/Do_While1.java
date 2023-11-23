package loopingstatement;

import java.util.Scanner;

public class Do_While1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int num = sc.nextInt();
		do {

			if(num>0) {
				System.out.println("number is +ve");
			}
			else {
			System.out.println("number is -ve");
			break;}
			
		}
		while(num<=0);

	}

}
