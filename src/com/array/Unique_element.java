//WAP TO calculate unique element in array.

package com.array;

import java.util.Arrays;

public class Unique_element {

	public static void unique(int a[], int n) {
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			while (i < n - 1 && a[i] == a[i + 1])
				i++;
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 6, 10, 6, 4, 5, 5, 7, 8, 9 };
		int n = a.length;
		unique(a, n);

	}
}
