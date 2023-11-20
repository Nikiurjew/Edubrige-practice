package com.operators;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of Side:");
		double S = sc.nextDouble();
		double C = S*S;
		System.out.println("the Area of Square is :" +C);
		sc.close();

	}

}
