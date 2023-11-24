package Pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		//int a=4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}



    