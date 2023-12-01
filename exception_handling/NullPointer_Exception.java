package exception_handling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		String str = null;
		int num = str.length();
		System.out.println(num);

	}

}
