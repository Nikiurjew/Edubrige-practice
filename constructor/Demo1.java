package constructor;

class A{
	A(){
		System.out.println("No-arg constructor");
	}
	A(int a, int b){
		System.out.println("Parameterized  "+(a+b));
	}
	
	
	
}
class B{
	int rollno=123;
	String name = "Niki";
	B(){
		System.out.println("Student Details:");
	}
	B(int rollno,String name){
		this.name=name;
		this.rollno=rollno;
		System.out.println(name);
		System.out.println(rollno);
	}
}
class Car{
	String Brand="TATA Motors";
	String Model="SUV";
	String Model1="Sedan";
	int Year=2015;
	Car(){
		System.out.println("details");
		System.out.println(Brand);
		System.out.println(Model);
		System.out.println(Model1);
		System.out.println(Year);
		
	}
	Car(String Brand,String Model,String Model1){
		this.Brand=Brand;
		this.Model=Model;
		this.Model1=Model1;
		System.out.println(Brand);
		System.out.println(Model);
		System.out.println(Model1);
	}
		
	}
	
	
	
	

public class Demo1 {

	public static void main(String[] args) {
		
		
	    A ob = new A(); 
	    A ob1 = new A(10,20);
		 
		B ob3=new B();
		B ob2= new B(126,"Niki");
		
		Car ob4 = new Car();
		Car ob5 = new Car("TATA Motors","SUV","Sedan");
		Car ob6 = new Car("Nan","fan","van");
		
	}

}
