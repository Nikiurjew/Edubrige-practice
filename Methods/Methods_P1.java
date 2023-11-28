package Methods;

public class Methods_P1 {
	
	//using int return type without argument as 0
	public int display7() {
		System.out.println("Hello");
		return 0;
	}
	
	//using int return type with arguments
	
	public int display8(int a,int b) {
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
	
	//using void as return type
	
	public void display2(int a,int b) {
		System.out.println("sum:"+(a+b));
		System.out.println("sub:"+(a-b));
	}
	public void display5(int a,int b) {
		System.out.println("mul:"+(a*b));
	}
	public void display6(int a,int b) {
		System.out.println("div:"+(a/b));
	}
	
	public void display() {
		System.out.println("Hello");
		
	}
	public void display1() {
		
		System.out.println("World");
	}


	public static void main(String[] args) {
		Methods_P1 ob = new Methods_P1();
		ob.display4(1, 20);
		ob.display();
		ob.display1();
		ob.display2(20, 10);
		ob.display5(5, 4);
		ob.display6(10, 2);
		ob.display7();
		ob.display8(2, 5);
		ob.display9(8, 4);
		ob.display10(9,3);
		ob.display11(4,2);
		
	}

}