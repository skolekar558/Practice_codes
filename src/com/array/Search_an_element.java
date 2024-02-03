//WAP TO search an element in an array.

package com.array;

import java.util.*;

public class Search_an_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size :");
		int l = s.nextInt();
		int a[] = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.printf("enter the array element a[%d]:", i);
			a[i] = s.nextInt();
		}
		System.out.println("enter element which you want to search");
		int s1 = s.nextInt();
		int f = 0, i;
		for (i = 0; i < l; i++) {
			if (a[i] == s1) {
				f = 1;
				break;
			}
		}
		if (f == 1) {
			System.out.printf("element found in position :%d\n", i + 1);
			System.out.printf("element found in index :%d", i);

		} else {
			System.out.println("element is not found :");
		}
	}

}
