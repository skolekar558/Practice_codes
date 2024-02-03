
//WAP to array element to print cubic value.

package com.array;

import java.util.*;

public class Cubic_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("Enter the element arr[%d]:",i);
			arr[i] = s.nextInt();

		}
		System.out.println("\nDisplay elements..........\n");
		for (int e:arr) {
			
			System.out.println(e*e*e);
		}
	}

}
