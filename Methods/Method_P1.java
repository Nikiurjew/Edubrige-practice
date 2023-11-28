package Methods;

import java.util.Scanner;

public class Method_P1 {
	static int sum(int a,int b) {
		if(a>b) {
			System.out.println(a+b);
		}
		else {
			System.out.println(a-b);
		}
		return a+b;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("emter the num:");
		int a=sc.nextInt();
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		//Method_P1 ob = new Method_P1();
		Method_P1.sum(a, b);
		
	}

}
