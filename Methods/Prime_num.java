package Methods;

import java.util.Scanner;

public class Prime_num {
	
	public static boolean primenum(float n) {
		int count= 1;
		for(int i = 2; i <=n;i++) {
			if(n % i ==0) {
				count++;
			}
			if(count ==0) {
				return true;
				
			}
			//return false;
		}
		return false;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		float n=sc.nextFloat();
		
		if(primenum(n)) {
			System.out.println(" the number is prime");
		}
		else {
			System.out.println("not prime");
			
		}
		Prime_num.primenum(n);
	}
	

	
	}


