package com.operators;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenght:");
		int L = sc.nextInt();
		System.out.println("enter the breadth: ");
		int B = sc.nextInt();
		int C = L*B;
		System.out.println("the Area of Rectangle is :" +C);
		sc.close();
	}

}
