package com.data;
//implicit- conversion of higher datatype to lower datatype. ex- int to long
//explicit- conversion of lower datatype to higher datatype . ex- long to int (it can be done by some operation)

public class TypeCastingDemo {

	public static void main(String[] args) {
		int a = 100;
		long b = a;
		System.out.println("implicit type casting" +b);
		
		byte c = 12;
		int d = c;
		System.out.println("implicit type casting" +d);
		
		short s = c;
		System.out.println("implicit type casting" +s);
		
		float f= b;
		System.out.println("implicit type casting" +f);
		
		double e =c;
		System.out.println("implicit type casting" +e);
		char A = 'N';
		int z=A;
		System.out.println("implicit type casting" +z);
		
		long L = 1000l;
		int S= (int) L;
		System.out.println("implicit type casting" +S);
		
		double D = 10.33;
		float F = (float) D;
		System.out.println("implicit type casting" +F);
		
		short X = (short)L;
		System.out.println("implicit type casting" +d);
		
		String str="42";
		int str1= Integer.parseInt(str) ;
		System.out.println("implicit type casting" +str1);

	}

}
