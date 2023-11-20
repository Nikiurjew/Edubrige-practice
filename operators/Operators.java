package com.operators;

public class Operators {

	public static void main(String[] args) {
		//post-increment
		int a = 10;
		int b = a++;
		System.out.println(b + " "+a);
		// pre-increment
		int c = 10;
		int d = ++c;
		System.out.println(d +" " +c);
		//pre- decrement
		int e = --c;
		System.out.println(e +" " +c);
		// post-Decrement
		int f = c--;
		System.out.println(f +" " +c);
		

	}

}
