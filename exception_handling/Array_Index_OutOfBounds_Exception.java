package exception_handling;

public class Array_Index_OutOfBounds_Exception {
	
	public static void main(String[] args) {
		try {
			int a []= {1,2,3,4};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		

	
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
		System.out.println(a[4]);

}
}
