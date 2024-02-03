//WAP to find even and odd element in array.

package com.array;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 34, 56, 79 };
		
		for (int e:arr) {
			if (e % 2 == 0) 
				System.out.println("Even no is:"+e);
			 else 
				System.out.println("Odd no is :" + e);
			
		}

	}
}