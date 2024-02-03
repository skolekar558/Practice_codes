//WAP TO print positive and negative  number in array.

package com.array;

import java.util.*;

public class Positive_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int l = s.nextInt();
		int a[] = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.printf("Enter the array element a[%d]:", i);
			a[i] = s.nextInt();
		}
		System.out.println("positive no:");
		for (int i = 0; i < l; i++) {
			if (a[i] > 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("negative no:");
		for(int i=0;i<l;i++) {
			if(a[i]<0)
			System.out.println(a[i]);
		}
	}
	
	

}
