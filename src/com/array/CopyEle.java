//WAP to copy the elements of one array into another array.

package com.array;

import java.util.*;

public class CopyEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = s.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.printf("Enter the element a[%d]:", i);
			a[i] = s.nextInt();
		}
		int c[] = new int[size];
		for (int i = 0; i < size; i++) {
			c[i] = a[i];
		}
		System.out.println("\n Original array:");
		for (int i = 0; i < size; i++) {
			System.out.printf("\n[%d]=%d", i, a[i]);
		}
		System.out.println("\n Copy array:");
		for (int i = 0; i < size; i++) {
			System.out.printf("\n [%d]=%d", i, c[i]);
		}
	}

}
