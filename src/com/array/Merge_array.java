package com.array;

import java.util.*;

public class Merge_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first array size:");
		int l = s.nextInt();
		System.out.println("enter the size of second array:");
		int l2 = s.nextInt();
		int a[] = new int[l];
		int c[] = new int[l2];
		int m[] = new int[100];
		for (int i = 0; i < l; i++) {
			System.out.printf("enter the array element a[%d]:", i);
			a[i] = s.nextInt();
		}
		for (int i = 0; i < l; i++) {
			System.out.printf("enter the array element c[%d]:", i);
			c[i] = s.nextInt();
		}
		System.out.println("\n First array:");
		for (int i = 0; i < l; i++) {
			System.out.printf("\n[%d]=%d", i, a[i]);
		}
		System.out.println("\n Second array:");
		for (int i = 0; i < l2; i++) {
			System.out.printf("\n [%d]=%d", i, c[i]);
		}
		int k=0;
 for(int i=0;i<l;i++) {
	 m[k]=a[i];
	 k++;
 }
 for(int i=0;i<l2;i++) {
	 m[k]=c[i];
	 k++;
 }
 System.out.println("\nMerge array......");
 for(int i=0;i<k;i++) {
	 System.out.printf("\nm[%d]=%d",i,m[i]);
 }
	}

}
