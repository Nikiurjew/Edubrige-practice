package comparator;

import java.util.HashMap;
import java.util.Scanner;

public class Abc_product {

	public static void main(String[] args) {
		while(true) {
		HashMap<String,Integer> stock = new HashMap<String,Integer>();
		stock.put("Smartphone", 20);
		stock.put("Iphone",25);
		stock.put("Laptop", 10);
		stock.put("Ipad", 15);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product to purchase");
		String pur = sc.nextLine();
		System.out.println("Enter the quantity to purchase: ");
		Integer qty = sc.nextInt();
		
		if(stock.containsKey(pur)) {
			 if(qty<=stock.get(pur)) {
			int remaining =  stock.get(pur)-qty;
			System.out.println("Purchased Successfully!.. Remaining Stocks are: "+remaining);
		}
		
		else if(qty>stock.get(pur)) {
			System.out.println("Sorry..... Out of stock");
		}
		}
		}


	}

}
