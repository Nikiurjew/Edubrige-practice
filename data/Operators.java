package com.data;
import java.util.*;

public class Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num=sc.nextInt();
		System.out.println("enter the second number:");
		int num1=sc.nextInt();
		int sum = num+num1;
		int sub = num1-num;
		int mul = num1 * num;
		int div = num1/num;
		System.out.println("The sum of two numbers x and y is: " + sum); 
		System.out.println("The sum of two numbers x and y is: " + sub); 
		System.out.println("The sum of two numbers x and y is: " + mul); 
		System.out.println("The sum of two numbers x and y is: " + div); 
		
	}

}
