package com.variables;

public class IntanceVariables {
	int a;
	float f;
	String s;
	byte b;
	long l;
	double d;
	char c;
	
	String name= "Nikita";
	String dept="CSE";
	int age = 24;
	long phonenum= 9957596024L;
	String Address= "Bihar sitamarhi";
	String Email= "nikijha108@gmail.com";
	
			
	public static void main(String[] args) {
		IntanceVariables ob = new IntanceVariables();
		System.out.println(ob.a);
		System.out.println(ob.f);
		System.out.println(ob.s);
		System.out.println(ob.b);
		System.out.println(ob.l);
		System.out.println(ob.d);
		System.out.println(ob.c);
		System.out.println("Name is: " +ob.name);
		System.out.println("Department is: "+ob.dept);
		System.out.println("Age is: "+ob.age);
		System.out.println("phone number is: "+ob.phonenum);
		System.out.println("Address: " +ob.Address);
		System.out.println("Email: "+ob.Email);
	}

}
