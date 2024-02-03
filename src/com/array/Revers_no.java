
//WAP in to read n number of values in an array and display it in reverse order.
package com.array;

import java.util.*;

public class Revers_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int arr[] = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.printf("Enter the element arr[%d]:", i);
			arr[i] = s.nextInt();

		}
		System.out.println("\nDisplay elements..........\n");
		for (int i=l-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

}


