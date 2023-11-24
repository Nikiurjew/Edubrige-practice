package Pattern;

public class Pattern11 {

	public static void main(String[] args) {
		int a=4;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
