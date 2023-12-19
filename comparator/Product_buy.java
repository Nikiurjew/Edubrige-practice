package comparator;

import java.util.HashMap;
import java.util.Scanner;

public class Product_buy {

	public static void main(String[] args) {
		HashMap <String,Integer> t= new HashMap<String,Integer>();
		t.put("Laptop",10);
		t.put("smartphone",20);
		t.put("tourch", 10);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the product name:");
		String item=sc.next();
		System.out.println("Enter the quantity:");
        int qty = sc.nextInt();

        int avlqty = t.get(item);

		
		if (t.containsKey(item)) {
            

            
            if (qty <= avlqty) {
                System.out.println("Product is available. Proceeding with the purchase.");

                
                t.put(item, avlqty - qty);
            } else {
                System.out.println("outOfStock.");
            }
        } else {
            System.out.println("Product not found.");
        }
    }

	
}
