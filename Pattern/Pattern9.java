package Pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int a=4;
		for(int i = 1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}


		

	}

}
