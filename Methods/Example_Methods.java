package Methods;

import java.util.Scanner;

public class Example_Methods {
	public int display1(float a,float b) {
		System.out.println("sum:"+(a+b));
		return a+b;
	}
	public int display9(int a,int b) {
		System.out.println("sub:"+(a-b));
		return a-b;
	}
	public int display10(int a,int b) {
		System.out.println("mul:"+(a*b));
		return a*b;
	}
	public int display11(int a,int b) {
		System.out.println("div:"+(a/b));
		return a/b;
	}
	public int display4(int a,int b) {
		System.out.println("sum:"+(a+b));
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number :");
		float a = sc.nextFloat();
		System.out.println("Enter the 2nd number :");
		float b = sc.nextFloat();
		System.out.println("select the operators : +,-,*,/");
		char op=sc.next().charAt(0);
		Example_Methods.display4(a,b);
		Example_Methods.display1(a,b);

	}

}




