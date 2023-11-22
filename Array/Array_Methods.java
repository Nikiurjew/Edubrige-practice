package com.Array;

import java.util.Arrays;

public class Array_Methods {

	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,6};
		// lenght method
		int length =  num.length;
		System.out.println(length);
		System.out.println(num[2]);
		
		// Shallow copy clone() method
		int [] a = {3,4,5};
		int [] b = a.clone();
		System.out.println(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//copyOf method
		
		
		
		
		
		//sort method
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		// fill methods
		int arr[] = new int[5];
		
		Arrays.fill(arr, 4);
		System.out.println(Arrays.toString(arr));
		arr[0]=10;
		arr[1]=20;
		System.out.println(Arrays.toString(arr));
		
		int arr1[] = {1,2,3,4,5};
		int index = Arrays.binarySearch(arr1, 3);
		System.out.println(index);
		
		int arr2[] = {1,2,3};
		int arr3[] = {1,2,3};
		boolean areEqual = Arrays.equals(arr2, arr3);
		System.out.println(areEqual);

	}

}
