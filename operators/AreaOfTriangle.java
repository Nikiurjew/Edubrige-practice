package com.operators;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of breadth:");
		double b = sc.nextDouble();
		System.out.println("enter the value of Height:");
		double h= sc.nextDouble();
		double A = 0.5*b*h;
		System.out.println("the Area of triangle is :" +A);

	}

}
