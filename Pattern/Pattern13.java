package Pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("enter the num");
		for(int i=1;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=row;k>=i;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
