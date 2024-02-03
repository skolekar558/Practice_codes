//WAP to find sum of even and odd no.

package com.array;

import java.util.*;

public class Sum_of_even_odd_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int a[] = new int[size];
		int sum = 0, i;
		for (i = 0; i < size; i++) {
			System.out.printf("enter the element a[%d]:", i);
			a[i] = s.nextInt();

		}
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				sum = sum + a[i];

			}
		}
		System.out.println(sum);
		sum = 0;
		for (i = 0; i < size; i++) {
			if (a[i] % 2 != 0) {
				sum = sum + a[i];

			}
		}
		System.out.println(sum);
	}
}
