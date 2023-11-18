package com.variables;

class StaticDemo{
	static String Student = "Muskan";
	static int USN= 116;
	
	static {
		System.out.println("Student details");
	}
	
}

public class StaticVariables {
	static String Student ="Nikita";
	static int USN =126;

	public static void main(String[] args) {
		
		System.out.println("The student name is : "+StaticDemo.Student);
		System.out.println("The student name is : "+StaticDemo.USN);
		System.out.println("The student name is : "+Student);
		System.out.println("The student name is : "+USN);
		

	}

}
