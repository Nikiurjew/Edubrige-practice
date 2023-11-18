package com.data;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println(name);
		System.out.print("Enter your age :");
		int Age =  sc.nextInt();
		System.out.println("my age is " +Age);
		System.out.println("enter your percentage");
		float percentage=sc.nextFloat();
		System.out.println("my percentage is : "+percentage);
		

	}

}
}