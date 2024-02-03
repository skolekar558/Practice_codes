
//WAP to calculate sum of cubic values.

package com.array;

import java.util.*;

public class Sum_of_cubic_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();
		int a[] = new int[size];
		int i;
		for (i = 0; i < size; i++) {
			System.out.printf("Enter the array element a[%d]:", i);
			a[i] = s.nextInt();
		}
		System.out.println("\nDisplay element.....\n");
		int sum = 0;
		int c;
		for (int e : a) {
			c = e * e * e;
			System.out.println(c);
			sum = sum + c;
		}
		System.out.println("sum of cubic values="+sum);

	}

}
