package Opps.concept;


	interface P1{
		public void p1properties();
	}
	interface P2{
		public void p2properties();
	}
	class Child2 implements P1,P2{

		@Override
		public void p2properties() {
			System.out.println("extending properties from Parent2");
			
		}

		@Override
		public void p1properties() {
			System.out.println("extending the properties from Parent2");
			
		}
		
	}
	public class Interface_Class {
	public static void main(String[] args) {
		Child2 ob= new Child2 ();
		ob.p1properties();
		ob.p2properties();

	}

	}
